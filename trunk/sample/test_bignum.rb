require 'common'

test_check "bignum"
def fact(nn)
  n = nn
  return 1 if n == 0
  f = 1
  while n>0
    f *= n
    n -= 1
  end
  return f
end
$x = fact(40)
test_ok($x == $x)
test_ok($x == fact(40))
test_ok($x < $x+2)
test_ok($x > $x-2)
test_ok($x == 815915283247897734345611269596115894272000000000)
test_ok($x != 815915283247897734345611269596115894272000000001)
test_ok($x+1 == 815915283247897734345611269596115894272000000001)
test_ok($x/fact(20) == 335367096786357081410764800000)
$x = -$x
test_ok($x == -815915283247897734345611269596115894272000000000)
test_ok(2-(2**32) == -(2**32-2))
test_ok(2**32 - 5 == (2**32-3)-2)

=begin
$good = true;
for i in 1000..1014
  $good = false if ((1 << i) != (2**i))
end
test_ok($good)

$good = true;
n1= 1 << 1000
for i in 1000..1014
  $good = false if ((1 << i) != n1)
  n1 *= 2
end
test_ok($good)

$good = true;
n2=n1
for i in 1..10
  n1 = n1 / 2
  n2 = n2 >> 1
  $good = false if (n1 != n2)
end
test_ok($good)

$good = true;
for i in 4000..4096
  n1 = 1 << i;
  if (n1**2-1) / (n1+1) != (n1-1)
    p i
    $good = false
  end
end
test_ok($good)

b = 10**80
a = b * 9 + 7
test_ok(7 == a.modulo(b))
test_ok(-b + 7 == a.modulo(-b))
test_ok(b + -7 == (-a).modulo(b))
test_ok(-7 == (-a).modulo(-b))
test_ok(7 == a.remainder(b))
test_ok(7 == a.remainder(-b))
test_ok(-7 == (-a).remainder(b))
test_ok(-7 == (-a).remainder(-b))

test_ok(10**40+10**20 == 10000000000000000000100000000000000000000)
test_ok(10**40/10**20 == 100000000000000000000)

a = 677330545177305025495135714080
b = 14269972710765292560
test_ok(a % b == 0)
test_ok(-a % b == 0)

def shift_test(a)
  b = a / (2 ** 32)
  c = a >> 32
  test_ok(b == c)

  b = a * (2 ** 32)
  c = a << 32
  test_ok(b == c)
end

shift_test(-4518325415524767873)
shift_test(-0xfffffffffffffffff)
=end
