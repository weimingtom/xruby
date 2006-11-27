require 'common'

test_check "const"
TEST1 = 1
TEST2 = 2

module Const
  TEST3 = 3
  TEST4 = 4
end

module Const2
  TEST3 = 6
  TEST4 = 8
end

include Const

test_ok([TEST1,TEST2,TEST3,TEST4] == [1,2,3,4])

include Const2
STDERR.print "intentionally redefines TEST3, TEST4\n" if $VERBOSE
test_ok([TEST1,TEST2,TEST3,TEST4] == [1,2,6,8])


test_ok((String <=> Object) == -1)
test_ok((Object <=> String) == 1)
test_ok((Array <=> String) == nil)


