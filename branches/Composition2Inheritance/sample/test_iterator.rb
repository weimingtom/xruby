require 'common'

test_check "iterator"

test_ok(!iterator?)

def ttt
  test_ok(iterator?)
end
ttt{}

# yield at top level
test_ok(!defined?(yield))

$x = [1, 2, 3, 4]
$y = []

# iterator over array
for i in $x
  $y.push i
end
test_ok($x == $y)

# nested iterator
def tt
  1.upto(10) {|i|
    yield i
  }
end

tt{|i| break if i == 5}
test_ok(i == 5)

def tt2(dummy)
  yield 1
end

def tt3(&block)
  tt2(raise(ArgumentError,""),&block)
end

$x = false
begin
  tt3{}
rescue ArgumentError
  $x = true
rescue Exception
end
test_ok($x)

def tt4 &block
  tt2(raise(ArgumentError,""),&block)
end
$x = false
begin
  tt4{}
rescue ArgumentError
  $x = true
rescue Exception
end
test_ok($x)

# iterator break/redo/next/retry
done = true
loop{
  break
  done = false			# should not reach here
}
test_ok(done)

done = false
$bad = false
loop {
  break if done
  done = true
  next
  $bad = true			# should not reach here
}
test_ok(!$bad)

done = false
$bad = false
loop {
  break if done
  done = true
  redo
  $bad = true			# should not reach here
}
test_ok(!$bad)

$x = []
for i in 1 .. 7
  $x.push i
end
test_ok($x.size == 7)
test_ok($x == [1, 2, 3, 4, 5, 6, 7])

$done = false
$x = []
for i in 1 .. 7			# see how retry works in iterator loop
  if i == 4 and not $done
    $done = true
    retry
  end
  $x.push(i)
end
test_ok($x.size == 10)
test_ok($x == [1, 2, 3, 1, 2, 3, 4, 5, 6, 7])

# append method to built-in class
class Array
  def iter_test1
    collect{|e| [e, yield(e)]}.sort{|a,b|a[1]<=>b[1]}
  end
  def iter_test2
    a = collect{|e| [e, yield(e)]}
    a.sort{|a,b|a[1]<=>b[1]}
  end
end
$x = [[1,2],[3,4],[5,6]]
test_ok($x.iter_test1{|x|x} == $x.iter_test2{|x|x})

class IterTest
  def initialize(e); @body = e; end

  def each0(&block); @body.each(&block); end
  def each1(&block); @body.each {|*x| block.call(*x) } end
  def each2(&block); @body.each {|*x| block.call(x) } end
  def each3(&block); @body.each {|x| block.call(*x) } end
  def each4(&block); @body.each {|x| block.call(x) } end
  def each5; @body.each {|*x| yield(*x) } end
  def each6; @body.each {|*x| yield(x) } end
  def each7; @body.each {|x| yield(*x) } end
  def each8; @body.each {|x| yield(x) } end

  def f(a)
    a
  end
end
test_ok(IterTest.new(nil).method(:f).to_proc.call([1]) == [1])
m = /\w+/.match("abc")
test_ok(IterTest.new(nil).method(:f).to_proc.call([m]) == [m])

IterTest.new([0]).each0 {|x| test_ok(x == 0)}
IterTest.new([1]).each1 {|x| test_ok(x == 1)}
IterTest.new([2]).each2 {|x| test_ok(x == [2])}
IterTest.new([3]).each3 {|x| test_ok(x == 3)}
IterTest.new([4]).each4 {|x| test_ok(x == 4)}
IterTest.new([5]).each5 {|x| test_ok(x == 5)}
IterTest.new([6]).each6 {|x| test_ok(x == [6])}
IterTest.new([7]).each7 {|x| test_ok(x == 7)}
IterTest.new([8]).each8 {|x| test_ok(x == 8)}

IterTest.new([[0]]).each0 {|x| test_ok(x == [0])}
IterTest.new([[1]]).each1 {|x| test_ok(x == [1])}
IterTest.new([[2]]).each2 {|x| test_ok(x == [[2]])}
IterTest.new([[3]]).each3 {|x| test_ok(x == 3)}
IterTest.new([[4]]).each4 {|x| test_ok(x == [4])}
IterTest.new([[5]]).each5 {|x| test_ok(x == [5])}
IterTest.new([[6]]).each6 {|x| test_ok(x == [[6]])}
IterTest.new([[7]]).each7 {|x| test_ok(x == 7)}
IterTest.new([[8]]).each8 {|x| test_ok(x == [8])}

IterTest.new([[0,0]]).each0 {|x| test_ok(x == [0,0])}
IterTest.new([[8,8]]).each8 {|x| test_ok(x == [8,8])}

def m
  test_ok(block_given?)
end
m{p 'test'}

def m
  test_ok(block_given?,&proc{})
end
m{p 'test'}

class C
  include Enumerable
  def initialize
    @a = [1,2,3]
  end
  def each(&block)
    @a.each(&block)
  end
end

test_ok(C.new.collect{|n| n} == [1,2,3])

test_ok(Proc == lambda{}.class)
test_ok(Proc == Proc.new{}.class)
lambda{|a|test_ok(a==1)}.call(1)
def block_test(klass, &block)
  test_ok(klass === block)
end

block_test(NilClass)
block_test(Proc){}

def argument_test(state, proc, *args)
  x = state
  begin
    proc.call(*args)
  rescue ArgumentError
    x = !x
  end
  test_ok(x,2)
end

argument_test(true, lambda{||})
argument_test(false, lambda{||}, 1)
argument_test(true, lambda{|a,|}, 1)
argument_test(false, lambda{|a,|})
argument_test(false, lambda{|a,|}, 1,2)

def get_block(&block)
  block
end

test_ok(Proc == get_block{}.class)
argument_test(true, get_block{||})
argument_test(true, get_block{||}, 1)
argument_test(true, get_block{|a,|}, 1)
argument_test(true, get_block{|a,|})
argument_test(true, get_block{|a,|}, 1,2)

argument_test(true, get_block(&lambda{||}))
argument_test(false, get_block(&lambda{||}),1)
argument_test(true, get_block(&lambda{|a,|}),1)
argument_test(false, get_block(&lambda{|a,|}),1,2)

block = get_block{11}
test_ok(block.class == Proc)
test_ok(block.to_proc.class == Proc)
test_ok(block.clone.call == 11)
test_ok(get_block(&block).class == Proc)

lambda = lambda{44}
test_ok(lambda.class == Proc)
test_ok(lambda.to_proc.class == Proc)
test_ok(lambda.clone.call == 44)
test_ok(get_block(&lambda).class == Proc)

test_ok(Proc.new{|a,| a}.call(1,2,3) == 1)
argument_test(true, Proc.new{|a,|}, 1,2)

def test_return1
  Proc.new {
    return 55
  }.call + 5
end
test_ok(test_return1() == 55)
def test_return2
  lambda {
    return 55
  }.call + 5
end
test_ok(test_return2() == 60)

def proc_call(&b)
  b.call
end
def proc_yield()
  yield
end
def proc_return1
  proc_call{return 42}+1
end
test_ok(proc_return1() == 42)
def proc_return2
  proc_yield{return 42}+1
end
test_ok(proc_return2() == 42)

def ljump_test(state, proc, *args)
  x = state
  begin
    proc.call(*args)
  rescue LocalJumpError
    x = !x
  end
  test_ok(x,2)
end

ljump_test(false, get_block{break})
ljump_test(true, lambda{break})

test_ok(block.arity == -1)
test_ok(lambda.arity == -1)
test_ok(lambda{||}.arity == 0)
test_ok(lambda{|a|}.arity == 1)
test_ok(lambda{|a,|}.arity == 1)
test_ok(lambda{|a,b|}.arity == 2)

def marity_test(m)
  method = method(m)
  test_ok(method.arity == method.to_proc.arity)
end
marity_test(:test_ok)
marity_test(:marity_test)
marity_test(:p)

lambda(&method(:test_ok)).call(true)
lambda(&get_block{|a,n| test_ok(a,n)}).call(true, 2)

class ITER_TEST1
   def a
     block_given?
   end
end

class ITER_TEST2 < ITER_TEST1
   def a
     test_ok(super)
     super
   end
end
test_ok(ITER_TEST2.new.a {})

class ITER_TEST3
  def foo x
    return yield if block_given?
    x
  end
end

class ITER_TEST4 < ITER_TEST3
  def foo x
    test_ok(super == yield)
    test_ok(super(x, &nil) == x)
  end
end

ITER_TEST4.new.foo(44){55}   


