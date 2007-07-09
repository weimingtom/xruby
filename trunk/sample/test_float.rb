require 'common'

test_check "float"
test_ok(2.6.floor == 2)
test_ok((-2.6).floor == -3)
test_ok(2.6.ceil == 3)
test_ok((-2.6).ceil == -2)
test_ok(2.6.truncate == 2)
test_ok((-2.6).truncate == -2)
test_ok(2.6.round == 3)
test_ok((-2.4).round == -2)
test_ok((13.4 % 1 - 0.4).abs < 0.0001)
=begin
nan = 0.0/0
def nan_test(x,y)
  test_ok(x != y)
  test_ok((x < y) == false)
  test_ok((x > y) == false)
  test_ok((x <= y) == false)
  test_ok((x >= y) == false)
end
nan_test(nan, nan)
nan_test(nan, 0)
nan_test(nan, 1)
nan_test(nan, -1)
nan_test(nan, 1000)
nan_test(nan, -1000)
nan_test(nan, 1_000_000_000_000)
nan_test(nan, -1_000_000_000_000)
nan_test(nan, 100.0);
nan_test(nan, -100.0);
nan_test(nan, 0.001);
nan_test(nan, -0.001);
nan_test(nan, 1.0/0);
nan_test(nan, -1.0/0);
=end
f = 3.7517675036461267e+17
# TODO: need String#% (format)
#test_ok(f == ("%.16e" % f).to_f)
test_ok(f == (f.to_s).to_f)

test_ok(1.0.finite? == true)
test_ok(1.0.infinite? == nil)
test_ok(1.0.nan? == false)

test_ok((-1.0).finite? == true)
test_ok((-1.0).infinite? == nil)
test_ok((-1.0).nan? == false)

$x = (1 << 33)
test_ok($x.to_f.finite? == true)
test_ok($x.to_f.infinite? == nil)
test_ok($x.to_f.nan? == false)

$y = $x ** $x
test_ok($y.finite? == false)
test_ok($y.infinite? == 1)
test_ok($y.nan? == false)

$x = 1.0 / 0
test_ok($x.infinite? == 1)
test_ok($x.finite? == false)
test_ok($x.nan? == false)

$x = (-1.0) / 0
test_ok($x.infinite? == -1)
test_ok($x.finite? == false)
test_ok($x.nan? == false)
