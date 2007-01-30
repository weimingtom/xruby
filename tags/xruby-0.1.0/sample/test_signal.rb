require 'common'

if defined? Process.kill
  test_check "signal"

  $x = 0
  trap "SIGINT", proc{|sig| $x = 2}
  Process.kill "SIGINT", $$
  sleep 0.1
  test_ok($x == 2)

  trap "SIGINT", proc{raise "Interrupt"}

  x = false
  begin
    Process.kill "SIGINT", $$
    sleep 0.1
  rescue
    x = $!
  end
  test_ok(x && /Interrupt/ =~ x.message)
end


