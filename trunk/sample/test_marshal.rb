require 'common'

def fact(n)
  return 1 if n == 0
  f = 1
  while n>0
    f *= n
    n -= 1
  end
  return f
end

test_check "marshal"
$x = [1,2,3,[4,5,"foo"],{1=>"bar"},2.5,fact(30)]
$y = Marshal.dump($x)
test_ok($x == Marshal.load($y))

StrClone=String.clone;
test_ok(Marshal.load(Marshal.dump(StrClone.new("abc"))).class == StrClone)

[[1,2,3,4], [81, 2, 118, 3146]].each { |w,x,y,z|
  a = (x.to_f + y.to_f / z.to_f) * Math.exp(w.to_f / (x.to_f + y.to_f / z.to_f))
  ma = Marshal.dump(a)
  b = Marshal.load(ma)
  test_ok(a == b)
}

