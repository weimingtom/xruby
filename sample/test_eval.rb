require 'common'

test_check "eval"
test_ok(eval("") == nil)
$bad=false
eval 'while false; $bad = true; print "foo\n" end'
test_ok(!$bad)

test_ok(eval('TRUE'))
test_ok(eval('true'))
test_ok(!eval('NIL'))
test_ok(!eval('nil'))
test_ok(!eval('FALSE'))
test_ok(!eval('false'))

$foo = 'test_ok(true)'
begin
  eval $foo
rescue
  test_ok(false)
end

test_ok(eval("$foo") == 'test_ok(true)')
test_ok(eval("true") == true)
i = 5
test_ok(eval("i == 5"))
test_ok(eval("i") == 5)
test_ok(eval("defined? i"))

# eval with binding
def test_ev
  local1 = "local1"
  lambda {
    local2 = "local2"
    return binding
  }.call
end

$x = test_ev
test_ok(eval("local1", $x) == "local1") # normal local var
test_ok(eval("local2", $x) == "local2") # nested local var
$bad = true
begin
  p eval("local1")
rescue NameError		# must raise error
  $bad = false
end
test_ok(!$bad)

module EvTest
  EVTEST1 = 25
  evtest2 = 125
  $x = binding
end
test_ok(eval("EVTEST1", $x) == 25)	# constant in module
test_ok(eval("evtest2", $x) == 125)	# local var in module
$bad = true
begin
  eval("EVTEST1")
rescue NameError		# must raise error
  $bad = false
end
test_ok(!$bad)

x = proc{}
eval "i4 = 1", x
test_ok(eval("i4", x) == 1)
x = proc{proc{}}.call
eval "i4 = 22", x
test_ok(eval("i4", x) == 22)
$x = []
x = proc{proc{}}.call
eval "(0..9).each{|i5| $x[i5] = proc{i5*2}}", x
test_ok($x[4].call == 8)

x = binding
eval "i = 1", x
test_ok(eval("i", x) == 1)
x = proc{binding}.call
eval "i = 22", x
test_ok(eval("i", x) == 22)
$x = []
x = proc{binding}.call
eval "(0..9).each{|i5| $x[i5] = proc{i5*2}}", x
test_ok($x[4].call == 8)
x = proc{binding}.call
eval "for i6 in 1..1; j6=i6; end", x
test_ok(eval("defined? i6", x))
test_ok(eval("defined? j6", x))

proc {
  p = binding
  eval "foo11 = 1", p
  foo22 = 5
  proc{foo11=22}.call
  proc{foo22=55}.call
  test_ok(eval("foo11", p) == eval("foo11"))
  test_ok(eval("foo11") == 1)
  test_ok(eval("foo22", p) == eval("foo22"))
  test_ok(eval("foo22") == 55)
}.call

p1 = proc{i7 = 0; proc{i7}}.call
test_ok(p1.call == 0)
eval "i7=5", p1
test_ok(p1.call == 5)
test_ok(!defined?(i7))

p1 = proc{i7 = 0; proc{i7}}.call
i7 = nil
test_ok(p1.call == 0)
eval "i7=1", p1
test_ok(p1.call == 1)
eval "i7=5", p1
test_ok(p1.call == 5)
test_ok(i7 == nil)


