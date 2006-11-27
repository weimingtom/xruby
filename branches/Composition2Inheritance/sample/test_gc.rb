require 'common'

test_check "gc"
begin
  1.upto(10000) {
    tmp = [0,1,2,3,4,5,6,7,8,9]
  }
  tmp = nil
  test_ok true
rescue
  test_ok false
end
class S
  def initialize(a)
    @a = a
  end
end
l=nil
100000.times {
  l = S.new(l)
}
GC.start
test_ok true   # reach here or dumps core
l = []
100000.times {
  l.push([l])
}
GC.start
test_ok true   # reach here or dumps core

if $failed > 0
  printf "test: %d failed %d\n", $ntest, $failed
else
  printf "end of test(test: %d)\n", $ntest
end

