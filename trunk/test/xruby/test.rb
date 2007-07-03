#The tests here are created by xruby team members
#Most other tests in the 'test' folder are copied from c ruby

require 'test/unit'

class XRubyTest < Test::Unit::TestCase

    def test_array_pack
        a = [ "a", "b", "c" ]
        #TODO
        #assert_equal("a\000\000b\000\000c\000\000", a.pack("a3a3a3"))
    end

    require 'delegate'
    def test_SimpleDelegator
        names = SimpleDelegator.new(%w{James Edward Gray II})
        assert_equal("Edward", names[1])
        names.__setobj__(%w{Gavin Sinclair})
        assert_equal("Sinclair", names[1])
    end

    def test_Enumerable_any?
        assert(%w{ ant bear cat}.any? {|word| word.length >= 3})
    end
    
    def test_String_succ
        assert_equal 'a'.succ, "b"
        assert_equal '0'.succ, "1"
        assert_equal ' '.succ, "!"
        assert_equal 'z'.succ, "aa"
        assert_equal '9'.succ, "10"
        assert_equal '***'.succ, "**+"
        assert_equal '<<koala>>'.succ, "<<koalb>>"
        assert_equal 'z>>'.succ, "aa>>"
        assert_equal 'zz>>'.succ, "aaa>>"
        assert_equal '1999zzz'.succ, "2000aaa"
        assert_equal '>z>>'.succ, ">aa>>"
    end
  
end