require 'common'

test_check('range')

a = (1 .. 3)
test_ok(a.begin == 1)
test_ok(a.end == 3)
test_ok(a.exclude_end? == false)
test_ok(a.first == 1)
test_ok(a.last == 3)

a = (1 ... 3)
test_ok(a.begin == 1)
test_ok(a.end == 3)
test_ok(a.exclude_end? == true)
test_ok(a.first == 1)
test_ok(a.last == 3)


a = Range.new(1, 3)
test_ok(a.begin == 1)
test_ok(a.end == 3)
test_ok(a.exclude_end? == false)
test_ok(a.first == 1)
test_ok(a.last == 3)


a = Range.new(1, 3, true)
test_ok(a.begin == 1)
test_ok(a.end == 3)
test_ok(a.exclude_end? == true)
test_ok(a.first == 1)
test_ok(a.last == 3)


