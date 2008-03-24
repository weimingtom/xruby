require 'common'

test_check('time')

t = Time.at(100)
test_ok(t.to_i == 100)
test_ok(t.to_f == 100)
#test_ok(t.to_s == "星期四 一月 01 08:00:00 +0800 1970")
test_ok(Time.at(1000) - t == 900)
test_ok(t + 900 == Time.at(1000))
test_ok((Time.at(100) <=> Time.at(100)) == 0)
test_ok((Time.at(100) <=> Time.at(101)) == -1)
test_ok((Time.at(100) <=> Time.at(99)) == 1)
