#The tests here are created by xruby team members
#Most other tests in the 'test' folder are copied from c ruby

require 'test/unit'

class XRubyTest < Test::Unit::TestCase

  def test_array_pack
    a = [ "a", "b", "c" ]
    #TODO
    #assert_equal("a\000\000b\000\000c\000\000", a.pack("a3a3a3"))
  end
  
end