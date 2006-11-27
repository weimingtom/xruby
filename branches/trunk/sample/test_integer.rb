require 'common'

test_check('integer')
test_ok(1.to_i == 1)
#test_ok(1.to_i.object_id == 1.object_id)
test_ok(33.to_i == 33)
#test_ok(33.to_i.object_id == 33.object_id)
32.times do |index|
	test_ok((1 << index).size == 4)
end

test_ok(1.to_f == 1.0)
test_ok(2.to_f == 2.0)
test_ok(3.to_f == 3.0)
test_ok((-3).to_f == -3.0)

test_ok(1.to_s == "1")
test_ok((1 << 31).to_s == "2147483648")

test_ok((-2 <=> -2) == 0)
test_ok((-2 <=> -1) == -1)
test_ok((-1 <=> 0) == -1)
test_ok((-1 <=> 1) == -1)
test_ok((0 <=> 1) == -1)
test_ok((0 <=> 0) == 0)
test_ok((1 <=> 2) == -1)
test_ok((1 <=> 1) == 0)

test_ok((-(1 << 24) <=> -(1 << 24)) == 0)
test_ok((-(1 << 24) <=> -(1 << 23)) == -1)
test_ok((-(1 << 24) <=> 0) == -1)
test_ok((-(1 << 24) <=> (1 << 24)) == -1)
test_ok((0 <=> (1 << 24)) == -1)
test_ok(((1 << 23) <=> (1 << 24)) == -1)
test_ok(((1 << 24) <=> (1 << 24)) == 0)

test_ok((~(1 << 24)) == -16777217)
test_ok(37 | 31 == 63)
test_ok(37 & 31 == 5)
test_ok(37 ^ 31 == 58)
test_ok(37 << 3 == 296)
test_ok(37 << -3 == 4)
test_ok(37 >> 3 == 4)
test_ok(37 >> -3 == 296)

$x = "110010".to_i(2)
test_ok($x == 50)
test_ok($x[0] == 0)
test_ok($x[1] == 1)
test_ok($x[2] == 0)
test_ok($x[3] == 0)
test_ok($x[4] == 1)
test_ok($x[5] == 1)
test_ok($x[6] == 0)

test_ok(20 * 30 == 600)
test_ok(301 / 20 == 15)
test_ok(20 + 30 == 50)
test_ok(20 - 30 == -10)
test_ok(301 % 20 == 1)
test_ok(2 ** 5 == 32)
# need Bignum
test_ok(2 ** 40 == 1099511627776)

test_ok(67.chr == "C")
test_ok(97.chr == "a")
