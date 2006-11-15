require 'common'

test_check "bignum"
def fact(n)
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

$x = "110010".to_i(2)

$x <<= 32
32.times do |index|
	test_ok($x[index] == 0)
end
test_ok($x[32] == 0)
test_ok($x[33] == 1)
test_ok($x[34] == 0)
test_ok($x[35] == 0)
test_ok($x[36] == 1)
test_ok($x[37] == 1)
test_ok($x[38] == 0)
100.times do |index|
	test_ok($x[38 + index] == 0)
end


$x = (1 << 50)
$y = (1 << 40)
test_ok($x.to_s == "1125899906842624")
test_ok((-$x).to_s == "-1125899906842624")
test_ok($y.to_s == "1099511627776")
test_ok($x + $y == 1126999418470400)
test_ok($x - $y == 1124800395214848)
test_ok($x * $y == 1237940039285380274899124224)
test_ok($x / $y == 1024)
test_ok($y % $x == 1099511627776)
test_ok($x ** 5 == 1809251394333065553493296640760748560207343510400633813116524750123642650624)

test_ok(~$x == -1125899906842625)
test_ok($x | $y == 1126999418470400)
test_ok($x & $y == 0)
test_ok($x ^ $y == 1126999418470400)
test_ok($x << 3 == 9007199254740992)
test_ok($x << -3 == 140737488355328)
test_ok($x >> 3 == 140737488355328)
test_ok($x >> -3 == 9007199254740992)

$x = ($x ** $x)
test_ok($x.class == Float)
test_ok($x.to_s == "Infinity")


test_ok(1.size == 4)
test_ok((1 << 31).size == 4)
test_ok((1 << 32).size == 8)
test_ok((1 << 63).size == 8)
test_ok((1 << 64).size == 12)

$x = (1 << 33)
test_ok($x == $x.to_i)
#test_ok($x.object_id == $x.to_i.object_id)

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
