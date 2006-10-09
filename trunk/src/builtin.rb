#Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
#
#Some built-in functions can be implemented in pure ruby, so they are implemented here.
#

module Kernel
	def to_a
		[self]
	end
end

=begin
class Symbol
	alias to_s id2name
end

class Array
	def to_a
		self
	end
	
	alias to_s join
	alias to_ary to_a
end

def self.to_s
	return "main"
end

=end

class String
	def to_s
		return self
	end
	
	alias to_str to_s
end

class Integer < Numeric
	
	def to_i
		return self
	end
	
	alias to_int to_i
	
	def times
		a = 0
		while a < self
			yield a
			a += 1;
		end
	end

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
end

class Fixnum < Integer
	def to_i
		self
	end
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
