require 'common'

test_check "call"
def aaa(a, b=100, *rest)
  res = [a, b]
  res += rest if rest
  return res
end

# not enough argument
begin
  aaa()				# need at least 1 arg
  test_ok(false)
rescue
  test_ok(true)
end

begin
  aaa				# no arg given (exception raised)
  test_ok(false)
rescue
  test_ok(true)
end

test_ok(aaa(1) == [1, 100])
test_ok(aaa(1, 2) == [1, 2])
test_ok(aaa(1, 2, 3, 4) == [1, 2, 3, 4])
test_ok(aaa(1, *[2, 3, 4]) == [1, 2, 3, 4])


