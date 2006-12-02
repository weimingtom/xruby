require 'common'

test_check "math"
test_ok(Math.sqrt(4) == 2)

include Math
test_ok(sqrt(4) == 2)

