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
    run_command "java -jar xruby-0.1.1.jar #{file}"
    print "\n"
  end
end

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
