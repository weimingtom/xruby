require 'common'

test_check "float"
test_ok(2.6.floor == 2)
test_ok((-2.6).floor == -3)
test_ok(2.6.ceil == 3)
test_ok((-2.6).ceil == -2)
test_ok(2.6.truncate == 2)
test_ok((-2.6).truncate == -2)
test_ok(2.6.round == 3)
test_ok((-2.4).truncate == -2)
test_ok((13.4 % 1 - 0.4).abs < 0.0001)
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

#s = "3.7517675036461267e+17"
#test_ok(s == sprintf("%.16e", s.to_f))
f = 3.7517675036461267e+17
test_ok(f == sprintf("%.16e", f).to_f)



