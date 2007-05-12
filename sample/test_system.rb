require 'common'

test_check "system"
test_ok(`echo foobar` == "foobar\n")
#java will remove double quote automatically from command line, so we have to change the test
#test_ok(`java -jar xruby-0.2.0.jar -e 'print "foobar"'` == 'foobar')
test_ok(`java -jar xruby-0.2.0.jar -e 'print 'foobar''` == 'foobar')
tmp = open("script_tmp", "w")
tmp.print "print $zzz\n";
tmp.close

test_ok(`java -jar xruby-0.2.0.jar -s script_tmp -zzz` == 'true')
#java will remove '=' automatically from command line, so we have to change the test
#test_ok(`java -jar xruby-0.2.0.jar -s script_tmp -zzz=555` == '555')
test_ok(`java -jar xruby-0.2.0.jar -s script_tmp "-zzz=555"` == '555')

tmp = open("script_tmp", "w")
tmp.print "#! /usr/local/bin/ruby -s\n";
tmp.print "print $zzz\n";
tmp.close

#java will remove '=' automatically from command line, so we have to change the test
#test_ok(`java -jar xruby-0.2.0.jar script_tmp -zzz=678` == '678')
test_ok(`java -jar xruby-0.2.0.jar script_tmp "-zzz=678"` == '678')

tmp = open("script_tmp", "w")
tmp.print "this is a leading junk\n";
tmp.print "#! /usr/local/bin/ruby -s\n";
tmp.print "print $zzz\n";
tmp.print "__END__\n";
tmp.print "this is a trailing junk\n";
tmp.close

test_ok(`java -jar xruby-0.2.0.jar -x script_tmp` == 'nil')
#java will remove '=' automatically from command line, so we have to change the test
#test_ok(`java -jar xruby-0.2.0.jar -x script_tmp -zzz=555` == '555')
test_ok(`java -jar xruby-0.2.0.jar -x script_tmp "-zzz=555"` == '555')

tmp = open("script_tmp", "w")
for i in 1..5
  tmp.print i, "\n"
end
tmp.close

#`java -jar xruby-0.2.0.jar -i.bak -pe 'sub(/^[0-9]+$/){$&.to_i * 5}' script_tmp`
`java -jar xruby-0.2.0.jar -i.bak -pe "sub(/^[0-9]+$/){$&.to_i * 5}" script_tmp`
done = true
tmp = open("script_tmp", "r")
while tmp.gets
  if $_.to_i % 5 != 0
    done = false
    break
  end
end
tmp.close
test_ok(done)

File.unlink "script_tmp" or `/bin/rm -f "script_tmp"`
File.unlink "script_tmp.bak" or `/bin/rm -f "script_tmp.bak"`

$bad = false
if (dir = File.dirname(File.dirname($0))) == '.'
  dir = ""
else
  dir << "/"
end

def valid_syntax?(code, fname)
  eval("BEGIN {return true}\n#{code}", nil, fname, 0)
rescue Exception
  puts $!.message
  false
end

for script in Dir["#{dir}{lib,sample,ext}/**/*.rb"]
  unless valid_syntax? IO::read(script), script
    $bad = true
  end
end
test_ok(!$bad)
