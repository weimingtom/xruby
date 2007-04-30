require 'common'

test_check "array"
test_ok([1, 2] + [3, 4] == [1, 2, 3, 4])
test_ok([1, 2] * 2 == [1, 2, 1, 2])
test_ok([1, 2] * ":" == "1:2")

test_ok([1, 2].hash == [1, 2].hash)

test_ok([1,2,3] & [2,3,4] == [2,3])
test_ok([1,2,3] | [2,3,4] == [1,2,3,4])
test_ok([1,2,3] - [2,3] == [1])

$x = [0, 1, 2, 3, 4, 5]
test_ok($x[2] == 2)
test_ok($x[1..3] == [1, 2, 3])
test_ok($x[1,3] == [1, 2, 3])

$x[0, 2] = 10
test_ok($x[0] == 10 && $x[1] == 2)
  
$x[0, 0] = -1
test_ok($x[0] == -1 && $x[1] == 10)

$x[-1, 1] = 20
test_ok($x[-1] == 20 && $x.pop == 20)

# array and/or
test_ok(([1,2,3]&[2,4,6]) == [2])
test_ok(([1,2,3]|[2,4,6]) == [1,2,3,4,6])

# compact
$x = [nil, 1, nil, nil, 5, nil, nil]
$x.compact!
test_ok($x == [1, 5])

# uniq
$x = [1, 1, 4, 2, 5, 4, 5, 1, 2]
$x.uniq!
test_ok($x == [1, 4, 2, 5])

# empty?
test_ok(!$x.empty?)
$x = []
test_ok($x.empty?)

# sort
$x = ["it", "came", "to", "pass", "that", "..."]
$x = $x.sort.join(" ")
test_ok($x == "... came it pass that to")
$x = [2,5,3,1,7]
$x.sort!{|a,b| a<=>b}		# sort with condition
test_ok($x == [1,2,3,5,7])
$x.sort!{|a,b| b-a}		# reverse sort
test_ok($x == [7,5,3,2,1])

# split test
$x = "The Book of Mormon"
test_ok($x.split(//).reverse!.join == $x.reverse)
test_ok($x.reverse == $x.reverse!)
test_ok("1 byte string".split(//).reverse.join(":") == "g:n:i:r:t:s: :e:t:y:b: :1")
$x = "a b c  d"
test_ok($x.split == ['a', 'b', 'c', 'd'])
test_ok($x.split(' ') == ['a', 'b', 'c', 'd'])
test_ok(defined? "a".chomp)
test_ok("abc".scan(/./) == ["a", "b", "c"])
test_ok("1a2b3c".scan(/(\d.)/) == [["1a"], ["2b"], ["3c"]])
# non-greedy match
test_ok("a=12;b=22".scan(/(.*?)=(\d*);?/) == [["a", "12"], ["b", "22"]])

$x = [1]
test_ok(($x * 5).join(":") == '1:1:1:1:1')
test_ok(($x * 1).join(":") == '1')
test_ok(($x * 0).join(":") == '')
test_ok([1,2,3,4,5].join(",") == "1,2,3,4,5")

*$x = *(1..7).to_a
test_ok($x.size == 7)
test_ok($x == [1, 2, 3, 4, 5, 6, 7])

$x = [1,2,3]
$x[1,0] = $x
test_ok($x == [1,1,2,3,2,3])

$x = [1,2,3]
$x[-1,0] = $x
test_ok($x == [1,2,1,2,3,3])

$x = [1,2,3]
$x.concat($x)
test_ok($x == [1,2,3,1,2,3])

#values
$x =%w{ a b c d e f }
test_ok($x.values_at(1, 3, 5)        ==  ["b", "d", "f"])
test_ok($x.values_at(1, 3, 5, 7)     ==  ["b", "d", "f", nil])
test_ok($x.values_at(-1, -3, -5, -7) ==  ["f", "d", "b", nil])
test_ok($x.values_at(1..3, 2...5)    ==  ["b", "c", "d", "c", "d", "e"])

###############################################################################################
##test from Programming Ruby

#[]
test_ok(Array.[]( 1, 'a', /^A/ ) ==[1, "a",/^A/])
test_ok(Array[ 1, 'a', /^A/ ]==[1, "a",/^A/])
test_ok([ 1, 'a',/^A/ ] ==[1, "a",/^A/])

#new
test_ok(Array.new==[])
test_ok(Array.new(2)==[nil,nil])
test_ok(Array.new(5,"A")==["A","A","A","A","A"])
a = Array.new(2, Hash.new)
a[0]['cat'] = 'feline'
test_ok(a   == [{"cat"=>"feline"}, {"cat"=>"feline"}])
a[1]['cat'] = 'Felix'
test_ok(a   == [{"cat"=>"Felix"}, {"cat"=>"Felix"}])
a = Array.new(2) { Hash.new } # Multiple instances
a[0]['cat'] = 'feline'
test_ok(a ==[{"cat"=>"feline"}, {}])
squares = Array.new(5) {|i| i*i}
test_ok( squares==[0, 1, 4, 9, 16])
copy = Array.new(squares)      # initialized by copying
squares[5] = 25
test_ok(squares   == [0, 1, 4, 9, 16, 25])
test_ok(copy      == [0, 1, 4, 9, 16])

#&
test_ok([ 1, 1, 3, 5 ] & [ 1, 2, 3 ] ==[1, 3])

#*
test_ok([ 1, 2, 3 ] * 3  ==[1, 2, 3, 1, 2, 3, 1, 2, 3])
test_ok([ 1, 2, 3 ] * "--" =="1--2--3")

#+
test_ok([ 1, 2, 3 ] + [ 4, 5 ]==[1, 2, 3, 4, 5])

#-
test_ok([ 1, 1, 2, 2, 3, 3, 4, 5 ] - [ 1, 2, 4 ] ==[3, 3, 5])

#<<
test_ok([ 1, 2 ] << "c" << "d" << [ 3, 4 ]==[1, 2, "c", "d", [3, 4]])

#<=>
test_ok(([ "a", "a", "c" ]    <=> [ "a", "b", "c" ])  == -1)
test_ok(([ 1, 2, 3, 4, 5, 6 ] <=> [ 1, 2 ])  ==1)

#==
test_ok(([ "a", "c" ]    == [ "a", "c", 7 ] ) ==false)
test_ok(([ "a", "c", 7 ] == [ "a", "c", 7 ] )   == true)
test_ok(([ "a", "c", 7 ] == [ "a", "d", "f" ])  == false)

#[]
a = [ "a", "b", "c", "d", "e" ]
test_ok(a[2] + a[0] + a[1] =="cab")
test_ok(a[6]     ==nil)
test_ok(a[1, 2]  ==["b", "c"])
test_ok(a[1..3]  ==["b", "c", "d"])
test_ok(a[4..7]==["e"])
test_ok(a[6..10]==nil)
test_ok(a[-3, 3] ==["c", "d", "e"])

# special cases
test_ok(a[5]     ==nil)
test_ok(a[5, 1]  ==[])
test_ok(a[5..10] ==[])

#[]=
test_ok((a = Array.new) == [])
a[4] = "4";                 test_ok( a ==  [nil, nil, nil, nil, "4"])
a[0] = [ 1, 2, 3 ];         test_ok(a  == [[1, 2, 3], nil, nil, nil, "4"])
a[0, 3] = [ 'a', 'b', 'c'];test_ok(a ==  ["a", "b", "c", nil, "4"])
a[1..2] = [ 1, 2 ];       test_ok( a ==["a", 1, 2, nil, "4"])
a[0, 2] = "?";             test_ok( a== ["?", 2, nil, "4"])
a[0..2] = "A";       test_ok( a ==  ["A", "4"])
a[-1]   = "Z";             test_ok( a ==  ["A", "Z"])
a[1..-1] = nil;         test_ok( a ==  ["A"])

#|
test_ok([ "a", "b", "c" ] | [ "c", "d", "a" ] ==  ["a", "b", "c", "d"])

#assoc
s1 = [ "colors", "red", "blue", "green" ]
s2 = [ "letters", "a", "b", "c" ]
s3 = "foo"
a = [ s1, s2, s3 ]
test_ok(a.assoc("letters")  ==["letters", "a", "b", "c"])
test_ok(a.assoc("foo")      == nil)

#at
a = [ "a", "b", "c", "d", "e" ]
test_ok(a.at(0)    =="a")
test_ok(a.at(-1)   =="e")

#clear
a = [ "a", "b", "c", "d", "e" ]
test_ok(a.clear  == [])

#collect!
a = [ "a", "b", "c", "d" ]
test_ok(a.collect! {|x| x + "!" }  == ["a!", "b!", "c!", "d!"])
test_ok(a         ==  ["a!", "b!", "c!", "d!"])

#compact
test_ok([ "a", nil, "b", nil, "c", nil ].compact ==  ["a", "b", "c"])

#compact!
test_ok [ "a", nil, "b", nil, "c" ].compact!  == ["a", "b", "c"]
test_ok [ "a", "b", "c" ].compact!   ==nil

#concat
test_ok [ "a", "b" ].concat( ["c", "d"] ) ==["a", "b", "c", "d"]

#delete
a = [ "a", "b", "b", "b", "c" ]
test_ok a.delete("b")                 ==    "b"
test_ok a                             ==    ["a", "c"]
test_ok a.delete("z")                 ==    nil
test_ok a.delete("z") { "not found" }  ==   "not found"

#delete_at
a = %w( ant bat cat dog )
test_ok a.delete_at(2)    == "cat"
test_ok a                 == ["ant", "bat", "dog"]
test_ok a.delete_at(99)  == nil

#delete_if
a = [ "a", "b", "c" ]
test_ok a.delete_if {|x| x >= "b" } ==["a"]

#each
a = [ "a", "b", "c" ]
test_ok a.each {|x| x }# == ["a","b","c"]

#each_index
a = [ "a", "b", "c" ]
a.each_index {|x| x} ==["a","b","c"]

#empty?
test_ok([].empty? ==true)
test_ok([ 1, 2, 3 ].empty?  == false)

#eql?
test_ok [ "a", "b", "c" ].eql?(["a", "b", "c"])  == true
test_ok [ "a", "b", "c" ].eql?(["a", "b"])       == false
test_ok [ "a", "b", "c" ].eql?(["b", "c", "d"])  == false

#fetch
$x = [ 11, 22, 33, 44 ]
test_ok($x.fetch(1) == 22)
test_ok($x.fetch(-1, 'cat') == 44)
test_ok($x.fetch(4, 'cat') == "cat")
test_ok($x.fetch(4) {|i| i*i } ==16)

#fill
$x = ["a","b","c","d"]
test_ok($x.fill("x") ==  ["x", "x", "x", "x"])
test_ok($x.fill("z", 2, 2)     ==     ["x", "x", "z", "z"])
test_ok($x.fill("y", 0..1)          ==["y", "y", "z", "z"])
test_ok($x.fill {|i| i*i}  ==         [0, 1, 4, 9])
test_ok($x.fill(-3) {|i| i+100}   ==  [0, 101, 102, 103])

#first
a = [ "q", "r", "s", "t" ]
test_ok a.first    == "q"
test_ok a.first(1)  == ["q"]
test_ok a.first(3)  == ["q", "r", "s"]

#flatten
s = [ 1, 2, 3 ]
t = [ 4, 5, 6, [7, 8] ]  
a = [ s, t, 9, 10 ]
test_ok a.flatten==[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

#flatten
a =[s,t,9,10]
test_ok a.flatten!==[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

#include?
a = [ "a", "b", "c" ]
test_ok a.include?("b") == true
test_ok a.include?("z") == false

#index
a = [ "a", "b", "c" ]
test_ok a.index("b")   ==1
test_ok a.index("z")   == nil

#insert
a = %w{ a b c d }
test_ok a.insert(2, 99)        == ["a", "b", 99, "c", "d"]
test_ok a.insert(-2, 1, 2, 3)  == ["a", "b", 99, "c", 1, 2, 3, "d"]
test_ok a.insert(-1, "e")      == ["a", "b", 99, "c", 1, 2, 3, "d", "e"]



