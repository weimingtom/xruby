require 'common'

test_check('class')

test_ok(Object == Object)
test_ok(Fixnum == Fixnum)
test_ok(1.class == Fixnum)
test_ok("".class == String)
