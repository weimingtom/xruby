require 'common'

test_check "clone"
foo = Object.new
def foo.test
  "test"
end
bar = foo.clone
def bar.test2
  "test2"
end

test_ok(bar.test2 == "test2")
test_ok(bar.test == "test")
test_ok(foo.test == "test")  

begin
  foo.test2
  test_ok false
rescue NoMethodError
  test_ok true
end

module M001; end
module M002; end
module M003; include M002; end
module M002; include M001; end
module M003; include M002; end

test_ok(M003.ancestors == [M003, M002, M001])

