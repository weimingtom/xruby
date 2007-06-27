require 'common'

test_check "trace"
$x = 1234
$y = 0
trace_var :$x, proc{$y = $x}
$x = 40414
test_ok($y == $x)

untrace_var :$x
$x = 19660208
test_ok($y != $x)

trace_var :$x, proc{$x *= 2}
$x = 5
test_ok($x == 10)

untrace_var :$x


