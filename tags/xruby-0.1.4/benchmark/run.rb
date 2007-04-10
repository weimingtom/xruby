
#This file is taken from ruby 1.9, but modified to fit XRuby
#NOTE: use '-Xmx512m' to avoid OutOfMemoryError!

# prepare 'wc.input'
def prepare_wc_input
  wcinput = File.join(File.dirname($0), 'wc.input')
  wcbase  = File.join(File.dirname($0), 'wc.input.base')
  unless FileTest.exist?(wcinput)
    data = File.read(wcbase)
    13.times{
      data << data
    }
    open(wcinput, 'w'){|f| f.write data}
  end
end

prepare_wc_input

def run_command command
  begin
    start_time = Time.new.to_f
    `#{command}`
    end_time = Time.now.to_f
    print end_time - start_time
  rescue Exception
    print 'fail'
  end
end

def bm file
  if file =~ /app_answer/ ||
    file =~ /app_factorial/ ||
    file =~ /so_ackermann/
    print file, "\tfail\tfail\n"
  else
    print file, "\t"
    run_command "ruby #{file}"
    print "\t"
    run_command "java -jar xruby-0.1.4.jar #{file}"
    print "\n"
  end
end

puts "Test\t\tRuby\t\tXRuby"

#bm_app_answer.rb, bm_app_factorial.rb, , bm_so_ackermann.rb will cause stack overflow
  if ARGV.empty?
    Dir.glob(File.dirname(__FILE__) + '/bm_*.rb').sort.each{|file|
      bm file
    }
  else
    ARGV.each{|file|
      Dir.glob(File.join(File.dirname(__FILE__), file + '*')){|ef|
        # file = "#{File.dirname(__FILE__)}/#{file}.rb"
        bm ef
      }
    }
  end
