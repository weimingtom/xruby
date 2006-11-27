require 'common'

test_check "pack"

$format = "c2x5CCxsdils_l_a6";
# Need the expression in here to force ary[5] to be numeric.  This avoids
# test2 failing because ary2 goes str->numeric->str and ary does not.
ary = [1,-100,127,128,32767,987.654321098 / 100.0,12345,123456,-32767,-123456,"abcdef"]
$x = ary.pack($format)
ary2 = $x.unpack($format)

test_ok(ary.length == ary2.length)
test_ok(ary.join(':') == ary2.join(':'))
test_ok($x =~ /def/)

$x = [-1073741825]
test_ok($x.pack("q").unpack("q") == $x)

