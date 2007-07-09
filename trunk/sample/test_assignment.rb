require 'common'

test_check "assignment"

a=[]; a[0] ||= "bar";
test_ok(a[0] == "bar")  #1

h={}; h["foo"] ||= "bar";
test_ok(h["foo"] == "bar") #2

aa = 5
aa ||= 25
test_ok(aa == 5)

bb ||= 25
test_ok(bb == 25)

cc &&=33
test_ok(cc == nil)
cc = 5
cc &&=44
test_ok(cc == 44)#6


a = nil; test_ok(a == nil)
a = 1; test_ok(a == 1) 



a = []; test_ok(a == [])

a = [1]; test_ok(a == [1])#10
a = [nil]; test_ok(a == [nil])
a = [[]]; test_ok(a == [[]])
a = [1,2]; test_ok(a == [1,2])



a = [*[]]; test_ok(a == [])
a = [*[1]]; test_ok(a == [1])
a = [*[1,2]]; test_ok(a == [1,2])


a = *nil; test_ok(a == nil)
a = *1; test_ok(a == 1)
a = *[]; test_ok(a == nil)
a = *[1]; test_ok(a == 1)#20
a = *[nil]; test_ok(a == nil)
a = *[[]]; test_ok(a == [])
a = *[1,2]; test_ok(a == [1,2])
a = *[*[]]; test_ok(a == nil)
a = *[*[1]]; test_ok(a == 1)
a = *[*[1,2]]; test_ok(a == [1,2])
*a = nil; test_ok(a == [nil])
*a = 1; test_ok(a == [1])
*a = []; test_ok(a == [[]])
*a = [1]; test_ok(a == [[1]])#30
*a = [nil]; test_ok(a == [[nil]])
*a = [[]]; test_ok(a == [[[]]])
*a = [1,2]; test_ok(a == [[1,2]])
*a = [*[]]; test_ok(a == [[]])
*a = [*[1]]; test_ok(a == [[1]])
*a = [*[1,2]]; test_ok(a == [[1,2]])
*a = *nil; test_ok(a == [nil])
*a = *1; test_ok(a == [1])
*a = *[]; test_ok(a == [])
*a = *[1]; test_ok(a == [1])
*a = *[nil]; test_ok(a == [nil])
*a = *[[]]; test_ok(a == [[]])
*a = *[1,2]; test_ok(a == [1,2])
*a = *[*[]]; test_ok(a == [])
*a = *[*[1]]; test_ok(a == [1])
*a = *[*[1,2]]; test_ok(a == [1,2])#46

a,b,*c = nil; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = 1; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = []; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = [1]; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = [nil]; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = [[]]; test_ok([a,b,c] == [[],nil,[]])
a,b,*c = [1,2]; test_ok([a,b,c] == [1,2,[]])
a,b,*c = [*[]]; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = [*[1]]; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = [*[1,2]]; test_ok([a,b,c] == [1,2,[]])#56

a,b,*c = *nil; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = *1; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = *[]; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = *[1]; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = *[nil]; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = *[[]]; test_ok([a,b,c] == [[],nil,[]])
a,b,*c = *[1,2]; test_ok([a,b,c] == [1,2,[]])
a,b,*c = *[*[]]; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = *[*[1]]; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = *[*[1,2]]; test_ok([a,b,c] == [1,2,[]])#66

def f; yield nil; end; f {|a| test_ok(a == nil)}
def f; yield 1; end; f {|a| test_ok(a == 1)}
def f; yield []; end; f {|a| test_ok(a == [])}
def f; yield [1]; end; f {|a| test_ok(a == [1])}
def f; yield [nil]; end; f {|a| test_ok(a == [nil])}
def f; yield [[]]; end; f {|a| test_ok(a == [[]])}
def f; yield [*[]]; end; f {|a| test_ok(a == [])}
def f; yield [*[1]]; end; f {|a| test_ok(a == [1])}
def f; yield [*[1,2]]; end; f {|a| test_ok(a == [1,2])}#75

def f; yield *nil; end; f {|a| test_ok(a == nil)}
def f; yield *1; end; f {|a| test_ok(a == 1)}
def f; yield *[1]; end; f {|a| test_ok(a == 1)}
def f; yield *[nil]; end; f {|a| test_ok(a == nil)}
def f; yield *[[]]; end; f {|a| test_ok(a == [])}
def f; yield *[*[1]]; end; f {|a| test_ok(a == 1)}#81

def f; yield; end; f {|*a| test_ok(a == [])}
def f; yield nil; end; f {|*a| test_ok(a == [nil])}
def f; yield 1; end; f {|*a| test_ok(a == [1])}
def f; yield []; end; f {|*a| test_ok(a == [[]])}
def f; yield [1]; end; f {|*a| test_ok(a == [[1]])}
def f; yield [nil]; end; f {|*a| test_ok(a == [[nil]])}
def f; yield [[]]; end; f {|*a| test_ok(a == [[[]]])}
def f; yield [1,2]; end; f {|*a| test_ok(a == [[1,2]])}
def f; yield [*[]]; end; f {|*a| test_ok(a == [[]])}
def f; yield [*[1]]; end; f {|*a| test_ok(a == [[1]])}
def f; yield [*[1,2]]; end; f {|*a| test_ok(a == [[1,2]])}#92

def f; yield *nil; end; f {|*a| test_ok(a == [nil])}
def f; yield *1; end; f {|*a| test_ok(a == [1])}
def f; yield *[]; end; f {|*a| test_ok(a == [])}
def f; yield *[1]; end; f {|*a| test_ok(a == [1])}
def f; yield *[nil]; end; f {|*a| test_ok(a == [nil])}
def f; yield *[[]]; end; f {|*a| test_ok(a == [[]])}
def f; yield *[*[]]; end; f {|*a| test_ok(a == [])}
def f; yield *[*[1]]; end; f {|*a| test_ok(a == [1])}
def f; yield *[*[1,2]]; end; f {|*a| test_ok(a == [1,2])}#101

def f; yield; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield nil; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield 1; end; f {|a,b,*c| test_ok([a,b,c] == [1,nil,[]])}
def f; yield []; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield [1]; end; f {|a,b,*c| test_ok([a,b,c] == [1,nil,[]])}
def f; yield [nil]; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield [[]]; end; f {|a,b,*c| test_ok([a,b,c] == [[],nil,[]])}
def f; yield [*[]]; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield [*[1]]; end; f {|a,b,*c| test_ok([a,b,c] == [1,nil,[]])}
def f; yield [*[1,2]]; end; f {|a,b,*c| test_ok([a,b,c] == [1,2,[]])}#111

def f; yield *nil; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield *1; end; f {|a,b,*c| test_ok([a,b,c] == [1,nil,[]])}
def f; yield *[]; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield *[1]; end; f {|a,b,*c| test_ok([a,b,c] == [1,nil,[]])}
def f; yield *[nil]; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield *[[]]; end; f {|a,b,*c| test_ok([a,b,c] == [[],nil,[]])}
def f; yield *[*[]]; end; f {|a,b,*c| test_ok([a,b,c] == [nil,nil,[]])}
def f; yield *[*[1]]; end; f {|a,b,*c| test_ok([a,b,c] == [1,nil,[]])}
def f; yield *[*[1,2]]; end; f {|a,b,*c| test_ok([a,b,c] == [1,2,[]])}#120

def r; return; end; a = r(); test_ok(a == nil)
def r; return nil; end; a = r(); test_ok(a == nil)
def r; return 1; end; a = r(); test_ok(a == 1)
def r; return []; end; a = r(); test_ok(a == [])
def r; return [1]; end; a = r(); test_ok(a == [1])
def r; return [nil]; end; a = r(); test_ok(a == [nil])
def r; return [[]]; end; a = r(); test_ok(a == [[]])
def r; return [*[]]; end; a = r(); test_ok(a == [])
def r; return [*[1]]; end; a = r(); test_ok(a == [1])
def r; return [*[1,2]]; end; a = r(); test_ok(a == [1,2])#130

def r; return *nil; end; a = r(); test_ok(a == nil)
def r; return *1; end; a = r(); test_ok(a == 1)
def r; return *[]; end; a = r(); test_ok(a == nil)
def r; return *[1]; end; a = r(); test_ok(a == 1)
def r; return *[nil]; end; a = r(); test_ok(a == nil)
def r; return *[[]]; end; a = r(); test_ok(a == [])
def r; return *[*[]]; end; a = r(); test_ok(a == nil)
def r; return *[*[1]]; end; a = r(); test_ok(a == 1)
def r; return *[*[1,2]]; end; a = r(); test_ok(a == [1,2])#139

def r; return *nil; end; a = *r(); test_ok(a == nil)
def r; return *1; end; a = *r(); test_ok(a == 1)
def r; return *[]; end; a = *r(); test_ok(a == nil)
def r; return *[1]; end; a = *r(); test_ok(a == 1)
def r; return *[nil]; end; a = *r(); test_ok(a == nil)
def r; return *[[]]; end; a = *r(); test_ok(a == nil)
def r; return *[*[]]; end; a = *r(); test_ok(a == nil)
def r; return *[*[1]]; end; a = *r(); test_ok(a == 1)
def r; return *[*[1,2]]; end; a = *r(); test_ok(a == [1,2])#148

def r; return; end; *a = r(); test_ok(a == [nil])
def r; return nil; end; *a = r(); test_ok(a == [nil])
def r; return 1; end; *a = r(); test_ok(a == [1])
def r; return []; end; *a = r(); test_ok(a == [[]])
def r; return [1]; end; *a = r(); test_ok(a == [[1]])
def r; return [nil]; end; *a = r(); test_ok(a == [[nil]])
def r; return [[]]; end; *a = r(); test_ok(a == [[[]]])
def r; return [1,2]; end; *a = r(); test_ok(a == [[1,2]])
def r; return [*[]]; end; *a = r(); test_ok(a == [[]])
def r; return [*[1]]; end; *a = r(); test_ok(a == [[1]])
def r; return [*[1,2]]; end; *a = r(); test_ok(a == [[1,2]])#159

def r; return *nil; end; *a = r(); test_ok(a == [nil])
def r; return *1; end; *a = r(); test_ok(a == [1])
def r; return *[]; end; *a = r(); test_ok(a == [nil])
def r; return *[1]; end; *a = r(); test_ok(a == [1])
def r; return *[nil]; end; *a = r(); test_ok(a == [nil])
def r; return *[[]]; end; *a = r(); test_ok(a == [[]])
def r; return *[1,2]; end; *a = r(); test_ok(a == [[1,2]])
def r; return *[*[]]; end; *a = r(); test_ok(a == [nil])
def r; return *[*[1]]; end; *a = r(); test_ok(a == [1])
def r; return *[*[1,2]]; end; *a = r(); test_ok(a == [[1,2]])#169

def r; return *nil; end; *a = *r(); test_ok(a == [nil])
def r; return *1; end; *a = *r(); test_ok(a == [1])
def r; return *[]; end; *a = *r(); test_ok(a == [nil])
def r; return *[1]; end; *a = *r(); test_ok(a == [1])
def r; return *[nil]; end; *a = *r(); test_ok(a == [nil])
def r; return *[[]]; end; *a = *r(); test_ok(a == [])
def r; return *[1,2]; end; *a = *r(); test_ok(a == [1,2])
def r; return *[*[]]; end; *a = *r(); test_ok(a == [nil])
def r; return *[*[1]]; end; *a = *r(); test_ok(a == [1])
def r; return *[*[1,2]]; end; *a = *r(); test_ok(a == [1,2])#179

def r; return; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return nil; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return 1; end; a,b,*c = r(); test_ok([a,b,c] == [1,nil,[]])
def r; return []; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return [1]; end; a,b,*c = r(); test_ok([a,b,c] == [1,nil,[]])
def r; return [nil]; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return [[]]; end; a,b,*c = r(); test_ok([a,b,c] == [[],nil,[]])
def r; return [1,2]; end; a,b,*c = r(); test_ok([a,b,c] == [1,2,[]])
def r; return [*[]]; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return [*[1]]; end; a,b,*c = r(); test_ok([a,b,c] == [1,nil,[]])
def r; return [*[1,2]]; end; a,b,*c = r(); test_ok([a,b,c] == [1,2,[]])#190

def r; return *nil; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return *1; end; a,b,*c = r(); test_ok([a,b,c] == [1,nil,[]])
def r; return *[]; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return *[1]; end; a,b,*c = r(); test_ok([a,b,c] == [1,nil,[]])
def r; return *[nil]; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return *[[]]; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return *[1,2]; end; a,b,*c = r(); test_ok([a,b,c] == [1,2,[]])
def r; return *[*[]]; end; a,b,*c = r(); test_ok([a,b,c] == [nil,nil,[]])
def r; return *[*[1]]; end; a,b,*c = r(); test_ok([a,b,c] == [1,nil,[]])
def r; return *[*[1,2]]; end; a,b,*c = r(); test_ok([a,b,c] == [1,2,[]])#200

f = lambda {|r,| test_ok([] == r)}
f.call([], *[])

f = lambda {|r,*l| test_ok([] == r); test_ok([1] == l)}
f.call([], *[1])

f = lambda{|x| x}
test_ok(f.call(42) == 42)
test_ok(f.call([42]) == [42])
test_ok(f.call([[42]]) == [[42]])
test_ok(f.call([42,55]) == [42,55])

f = lambda{|x,| x}
test_ok(f.call(42) == 42)
test_ok(f.call([42]) == [42])
test_ok(f.call([[42]]) == [[42]])
test_ok(f.call([42,55]) == [42,55])

f = lambda{|*x| x}
test_ok(f.call(42) == [42])
test_ok(f.call([42]) == [[42]])
test_ok(f.call([[42]]) == [[[42]]])
test_ok(f.call([42,55]) == [[42,55]])
test_ok(f.call(42,55) == [42,55])#216

a,=*[1]
test_ok(a == 1)
a,=*[[1]]
test_ok(a == [1])
a,=*[[[1]]]
test_ok(a == [[1]])#219

x, (y, z) = 1, 2, 3
test_ok([1,2,nil] == [x,y,z])
x, (y, z) = 1, [2,3]
test_ok([1,2,3] == [x,y,z])
x, (y, z) = 1, [2]
test_ok([1,2,nil] == [x,y,z])#222

a = loop do break; end; test_ok(a == nil)
a = loop do break nil; end; test_ok(a == nil)
a = loop do break 1; end; test_ok(a == 1)
a = loop do break []; end; test_ok(a == [])
a = loop do break [1]; end; test_ok(a == [1])
a = loop do break [nil]; end; test_ok(a == [nil])
a = loop do break [[]]; end; test_ok(a == [[]])
a = loop do break [*[]]; end; test_ok(a == [])
a = loop do break [*[1]]; end; test_ok(a == [1])
a = loop do break [*[1,2]]; end; test_ok(a == [1,2])#232

a = loop do break *nil; end; test_ok(a == nil)
a = loop do break *1; end; test_ok(a == 1)
a = loop do break *[]; end; test_ok(a == nil)
a = loop do break *[1]; end; test_ok(a == 1)
a = loop do break *[nil]; end; test_ok(a == nil)
a = loop do break *[[]]; end; test_ok(a == [])
a = loop do break *[*[]]; end; test_ok(a == nil)
a = loop do break *[*[1]]; end; test_ok(a == 1)
a = loop do break *[*[1,2]]; end; test_ok(a == [1,2])#241

*a = loop do break; end; test_ok(a == [nil])
*a = loop do break nil; end; test_ok(a == [nil])
*a = loop do break 1; end; test_ok(a == [1])
*a = loop do break []; end; test_ok(a == [[]])
*a = loop do break [1]; end; test_ok(a == [[1]])
*a = loop do break [nil]; end; test_ok(a == [[nil]])
*a = loop do break [[]]; end; test_ok(a == [[[]]])
*a = loop do break [1,2]; end; test_ok(a == [[1,2]])
*a = loop do break [*[]]; end; test_ok(a == [[]])
*a = loop do break [*[1]]; end; test_ok(a == [[1]])
*a = loop do break [*[1,2]]; end; test_ok(a == [[1,2]])#252

*a = loop do break *nil; end; test_ok(a == [nil])
*a = loop do break *1; end; test_ok(a == [1])
*a = loop do break *[]; end; test_ok(a == [nil])
*a = loop do break *[1]; end; test_ok(a == [1])
*a = loop do break *[nil]; end; test_ok(a == [nil])
*a = loop do break *[[]]; end; test_ok(a == [[]])
*a = loop do break *[1,2]; end; test_ok(a == [[1,2]])
*a = loop do break *[*[]]; end; test_ok(a == [nil])
*a = loop do break *[*[1]]; end; test_ok(a == [1])
*a = loop do break *[*[1,2]]; end; test_ok(a == [[1,2]])#262

*a = *loop do break *nil; end; test_ok(a == [nil])
*a = *loop do break *1; end; test_ok(a == [1])
*a = *loop do break *[]; end; test_ok(a == [nil])
*a = *loop do break *[1]; end; test_ok(a == [1])
*a = *loop do break *[nil]; end; test_ok(a == [nil])
*a = *loop do break *[[]]; end; test_ok(a == [])
*a = *loop do break *[1,2]; end; test_ok(a == [1,2])
*a = *loop do break *[*[]]; end; test_ok(a == [nil])
*a = *loop do break *[*[1]]; end; test_ok(a == [1])
*a = *loop do break *[*[1,2]]; end; test_ok(a == [1,2])#272

a,b,*c = loop do break; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break nil; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break 1; end; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = loop do break []; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break [1]; end; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = loop do break [nil]; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break [[]]; end; test_ok([a,b,c] == [[],nil,[]])
a,b,*c = loop do break [1,2]; end; test_ok([a,b,c] == [1,2,[]])
a,b,*c = loop do break [*[]]; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break [*[1]]; end; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = loop do break [*[1,2]]; end; test_ok([a,b,c] == [1,2,[]])#283

a,b,*c = loop do break *nil; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break *1; end; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = loop do break *[]; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break *[1]; end; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = loop do break *[nil]; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break *[[]]; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break *[1,2]; end; test_ok([a,b,c] == [1,2,[]])
a,b,*c = loop do break *[*[]]; end; test_ok([a,b,c] == [nil,nil,[]])
a,b,*c = loop do break *[*[1]]; end; test_ok([a,b,c] == [1,nil,[]])
a,b,*c = loop do break *[*[1,2]]; end; test_ok([a,b,c] == [1,2,[]])#293

def r(val); a = yield(); test_ok(a == val, 2); end
r(nil){next}
r(nil){next nil}
r(1){next 1}
r([]){next []}
r([1]){next [1]}
r([nil]){next [nil]}
r([[]]){next [[]]}
r([]){next [*[]]}
r([1]){next [*[1]]}
r([1,2]){next [*[1,2]]}#303

r(nil){next *nil}
r(1){next *1}
r(nil){next *[]}
r(1){next *[1]}
r(nil){next *[nil]}
r([]){next *[[]]}
r(nil){next *[*[]]}
r(1){next *[*[1]]}
r([1,2]){next *[*[1,2]]}#312

def r(val); *a = yield(); test_ok(a == val, 2); end
r([nil]){next}
r([nil]){next nil}
r([1]){next 1}
r([[]]){next []}
r([[1]]){next [1]}
r([[nil]]){next [nil]}
r([[[]]]){next [[]]}
r([[1,2]]){next [1,2]}
r([[]]){next [*[]]}
r([[1]]){next [*[1]]}
r([[1,2]]){next [*[1,2]]}#323

def r(val); *a = *yield(); test_ok(a == val, 2); end
r([nil]){next *nil}
r([1]){next *1}
r([nil]){next *[]}
r([1]){next *[1]}
r([nil]){next *[nil]}
r([]){next *[[]]}
r([1,2]){next *[1,2]}
r([nil]){next *[*[]]}
r([1]){next *[*[1]]}
r([1,2]){next *[*[1,2]]}#333

def r(val); a,b,*c = yield(); test_ok([a,b,c] == val, 2); end
r([nil,nil,[]]){next}
r([nil,nil,[]]){next nil}
r([1,nil,[]]){next 1}
r([nil,nil,[]]){next []}
r([1,nil,[]]){next [1]}
r([nil,nil,[]]){next [nil]}
r([[],nil,[]]){next [[]]}
r([1,2,[]]){next [1,2]}
r([nil,nil,[]]){next [*[]]}
r([1,nil,[]]){next [*[1]]}
r([1,2,[]]){next [*[1,2]]}#344

def r(val); a,b,*c = *yield(); test_ok([a,b,c] == val, 2); end
r([nil,nil,[]]){next *nil}
r([1,nil,[]]){next *1}
r([nil,nil,[]]){next *[]}
r([1,nil,[]]){next *[1]}
r([nil,nil,[]]){next *[nil]}
r([nil,nil,[]]){next *[[]]}
r([1,2,[]]){next *[1,2]}
r([nil,nil,[]]){next *[*[]]}
r([1,nil,[]]){next *[*[1]]}
r([1,2,[]]){next *[*[1,2]]}#354

