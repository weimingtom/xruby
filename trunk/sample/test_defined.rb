require 'common'

test_check "defined?"

test_ok(defined?($x))		# global variable
test_ok(defined?($x) == 'global-variable')# returns description

foo=5
test_ok(defined?(foo))		# local variable

test_ok(defined?(Array))	# constant
test_ok(defined?(Object.new))	# method
test_ok(!defined?(Object.print))# private method
test_ok(defined?(1 == 2))	# operator expression

class Foo
  def foo
    p :foo
  end
  protected :foo
  def bar(f)
    test_ok(defined?(self.foo))
    test_ok(defined?(f.foo))
  end
end
f = Foo.new
test_ok(defined?(f.foo) == nil)
f.bar(f)

def defined_test
  return !defined?(yield)
end

test_ok(defined_test)		# not iterator
test_ok(!defined_test{})	# called as iterator

