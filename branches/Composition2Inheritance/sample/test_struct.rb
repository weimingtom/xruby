require 'common'

test_check "struct"
struct_test = Struct.new("Test", :foo, :bar)
test_ok(struct_test == Struct::Test)

test = struct_test.new(1, 2)
test_ok(test.foo == 1 && test.bar == 2)
test_ok(test[0] == 1 && test[1] == 2)

a, b = test.to_a
test_ok(a == 1 && b == 2)

test[0] = 22
test_ok(test.foo == 22)

test.bar = 47
test_ok(test.bar == 47)


