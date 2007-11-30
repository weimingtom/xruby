#The tests here are created by xruby team members
#Most other tests in the 'test' folder are copied from c ruby

require 'test/unit'

class XRubyTest < Test::Unit::TestCase

    def test_Array_pack
        assert_equal('a', [97].pack('U'))
        assert_equal([97], [97].pack('U').unpack('U'))
        
        a = [ "a", "b", "c" ]
        #TODO
        #assert_equal("a\000\000b\000\000c\000\000", a.pack("a3a3a3"))
    end
    
    def test_Array_pop
        assert_equal(nil, [].pop)
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
    
    def test_String_misc
        assert_equal 'a'[0...-1], ""
    end
    
    def test_Hash_index
        h = {1=>2}
        assert_equal h.index(2), 1
        assert_equal h.index(3), nil
    end
    
    def test_ENV
        assert_equal ENV.to_s, "ENV"
        ENV['xxx']='yyy'
        assert_equal ENV['xxx'], "yyy"
    end
    
    def test_Kernel_sprintf
        assert_equal sprintf("%f", 1.1), "1.100000"
    end
    
    def test_Numeric_div
        assert_equal 4.2.div(2), 2
        assert_equal -4.2.div(2), -3
    end
    
    def test_Float_compare
        assert_equal (0.0/0 <=> 0.0/0), nil
        assert !(0.0/0 <= 0.0/0)
    end
    
    class DefMethod
            define_method("def_method_x1") {1}
            define_method("def_method_x2", proc {2})
    end
    def test_Module_define_method
        assert_equal 1, DefMethod.new.def_method_x1
        assert_equal 2, DefMethod.new.def_method_x2
    end
    
    def test_Kernel_taint
        a=''
        assert !a.tainted?
        a.taint
        assert a.tainted?
        assert !''.tainted?
    end
    
    require 'forwardable'
    class TestingQueue
         extend Forwardable
         
         def initialize
           @q = [ ]    # prepare delegate object
         end
         
         # setup prefered interface, enq() and deq()...
         def_delegator :@q, :push, :enq
         def_delegator :@q, :shift, :deq
         
         # support some general Array methods that fit Queues well
         def_delegators :@q, :clear, :first, :push, :shift, :size
    end
    def test_forwardable
        q = TestingQueue.new
        q.enq 1, 2, 3, 4, 5
        q.push 6
     
        assert_equal 6, q.size 
        assert_equal 1, q.shift
        assert_equal 5, q.size 
        
        i = 2
        while q.size > 0
            assert i, q.deq
            i += 1
        end
        assert_equal 7, i 
     
        q.enq "Ruby", "Perl", "Python"
        assert_equal "Ruby", q.first
        q.clear
        assert_equal nil, q.first
    end
    
    def test_Hash_merge
      h1 = { "a" => 100, "b" => 200 }
      h2 = { "b" => 254, "c" => 300 }
      h3 = h1.merge(h2)
      assert_equal({ "a" => 100, "b" => 254, "c" => 300 }, h3)
      assert_equal({ "a" => 100, "b" => 200}, h1)
    end
    
end