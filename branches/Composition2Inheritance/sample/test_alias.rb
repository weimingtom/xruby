require 'common'

test_check "alias"
class Alias0
  def foo; "foo" end
end
class Alias1<Alias0
  alias bar foo
  def foo; "foo+" + super end
end
class Alias2<Alias1
  alias baz foo
  undef foo
end

x = Alias2.new
test_ok(x.bar == "foo")
test_ok(x.baz == "foo+foo")

# test_check for cache
test_ok(x.baz == "foo+foo")

class Alias3<Alias2
  def foo
    defined? super
  end
  def bar
    defined? super
  end
  def quux
    defined? super
  end
end
x = Alias3.new
test_ok(!x.foo)
test_ok(x.bar)
test_ok(!x.quux)

