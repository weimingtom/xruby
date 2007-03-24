 
#
# Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
# Distributed under the GNU General Public License 2.0
#

#
#Some built-in functions can be implemented in pure ruby, so they are implemented here.
#

$: = ["./lib/ruby/1.8", "."]
$__loaded_libraries = []

$* = ARGV

module Kernel
	def to_a
		[self]
	end
  
	def =~ x
		return false
	end

	alias require__ require
	alias load__    load

	#private
	def require(path)
		$:.length.times do |index|
			file_name = $:[index] + "/" + path
      if path[-3..-1] != ".rb"
        file_name << ".rb"
      end
			next unless ::File.file?(file_name)
			return load_once(file_name)
		end
		require__(path)	
	end

	#private
	def load(path)
		$:.length.times do |index|
			file_name = $:[index] + "/" + path
      if path[-3..-1] != ".rb"
        file_name << ".rb"
      end
			next unless ::File.file?(file_name)
			return load_file(file_name)
		end
		require__(path)	
	end

	private
	def load_once(file_name)
		absolute_path = ::File.expand_path(file_name)
		return false if $__loaded_libraries.include?(absolute_path)
		result = load_file(absolute_path)
		result
	end

	private
	def load_file(file_name)
		#puts "[DEBUG] Loading library: #{file_name}"

		content = ::IO.read(file_name)
		eval(content, nil)
		$__loaded_libraries.push(file_name) unless $__loaded_libraries.include?(file_name)
		true
	end
end

class Object
	def nil?
		false
	end
end

class Array
	def to_a
		self
	end

	def join(sepString="")
		return to_s if sepString.nil? || sepString == ""

		result = ""
		(length - 1).times do |index|
			result += (self[index].to_s) + sepString
		end
		result += self[length - 1].to_s if length != 0
		result
	end
	
	#alias join to_s
	alias to_ary to_a
	alias size length

	def empty?
		length == 0
	end
  
  def inspect
    str = "["
    is_first = true;
    self.each() { |x|
      if (!is_first)
        str += ", "
      end
      is_first = false;
      str += x.inspect
    }
    str += "]";
    return str
  end
  
end

class Symbol
	alias to_s id2name
end

def self.to_s
	return "main"
end

def self.public
  Object.public
end

def self.private
  Object.private
end

def self.protected
  Object.protected
end

def ENV.to_s
  return "ENV"
end

class String
  include Comparable
  
	def to_s
		return self
	end

	def succ
	end
  
  def empty?
    length == 0
  end
	
  def inspect
    '"' + to_s + '"'
  end
  
	alias to_str to_s
	alias size length
end

module Comparable
	def >=(value)
		compare = (self <=> value)
		return compare != -1
	end

	def ==(value)
		compare = (self <=> value)
		return compare == 0
	end

	def <=(value)
		compare = (self <=> value)
		return compare != 1
	end

	def >(value)
		compare = (self <=> value)
		return compare == 1
	end

	def <(value)
		compare = (self <=> value)
		return compare == -1
	end

	def between?(a, b)
		self >= a && self <= b
	end
end

class Numeric
	include Comparable

	def abs
		return -self if (self <=> 0) == -1
		self
	end

	def coerce(value)
		[self, value]
	end

	def divmod(value)
		[self / value, self % value]
	end

	def integer?
		false
	end

	alias eql? :==

	def modulo(value)
		self % value
	end

	def nonzero?
		return nil if self == 0
		self
	end
	
	def zero?
		return true if self == 0
		false
	end

	def remainder(value)
		self_sign = (self < 0)
		value_sign = (value < 0)
		return self % value if self_sign == value_sign
		self % (-value)
	end

end

class Integer < Numeric

	def to_i
		return self
	end
	
	alias to_int to_i
  
	#Returns the Integer equal to int + 1
	def next
		self + 1
	end

	#Synonym for Integer#next
	def succ
		self + 1
	end

	#Always returns true
	def integer?
		true
	end

	def upto(to)
		a = self
		while a <= to
			yield a
			a += 1
		end
	end

	def downto(to)
		a = self
		while a >= to
			yield a
			a -= 1
		end
	end

	def size
		4
	end

	def integer?
		true
	end
end

class Fixnum < Integer
	def to_i
		self
	end
	
	alias inspect to_s
end

class Bignum < Integer
	#undef new
end

class NilClass
	
	#Returns false
	def &(anObject)
		false
	end

	#Returns false if anObject is nil or false, true otherwise
	def ^(anObject)
		anObject ? true : false
	end
	
	#Returns false if anObject is nil or false, true otherwise
	def |(anObject)
		anObject ? true : false
	end
	
	#Always returns true
	def nil?
		true
	end
	
	#Always returns an empty array
	def to_a
		[]
	end
	
	#Always returns zero
	def to_i
		0
	end
	
	def to_f
		0.0
	end
	
	#Always returns the empty string
	def to_s
		""
	end

	def inspect
		"nil"
	end
end

class TrueClass
	#Returns false if anObject is nil or false, true otherwise
	def &(anObject)
		anObject ? true : false
	end
	
	#Returns true if anObject is nil or false, false otherwise
	def ^(anObject)
		anObject ? false : true
	end
	
	#Returns true
	def |(anObject)
		true
	end

	def to_s
		return "true"
	end
end

class FalseClass
	
	#Returns false
	def &(anObject)
		false
	end
	
	#If anObject is nil or false, returns false; otherwise, returns true
	def ^(anObject)
		anObject ? true : false
	end
	
	#Returns false if anObject is nil or false; true otherwise
	def |(anObject)
		anObject ? true : false
	end
	
	def to_s
		return "false"
	end
end

class Range
  include Enumerable
  
	def ===(value)
		each do |item|
			return true if value == item
		end
		false
	end

	def to_s
		return self.begin.to_s + "..." + self.end.to_s if exclude_end?
		return self.begin.to_s + ".." + self.end.to_s
	end

	alias first :begin
	alias last :end
end

class File < IO
	SEPARATOR = separator

	def self.join(*strings)
		strings.join(separator)
	end

	def self.split(filename)
		[dirname(filename), basename(filename)]
	end
end

class Time
	include Comparable
end

class Dir
end

class ThreadError < StandardError
end

class Proc
  def to_proc
    self
  end
end

class File
  SEPARATOR = '/'
  
  def File.join *aString
    s = ""
    first = true
    aString.each {|x|
      if !first
        s += File::SEPARATOR
      end
      s+= x
      first = false
    }
    s
  end
end

module Enumerable
  def find_all
    a = []
    each {|x|
      if yield x
        a.push(x)
      end
    }
    return a
  end
  
  def inject(memo = 0)
    each {|obj| memo = yield(memo, obj)}
    memo
  end
  
  alias :select :find_all
end