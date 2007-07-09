require 'common'

test_check('file')

test_ok(File.dirname("/abc/def") == "/abc")
test_ok(File.dirname("/abc/def.ghi") == "/abc")
test_ok(File.basename("/abc/def") == "def")
test_ok(File.basename("/abc/def.ghi") == "def.ghi")
test_ok(File.split("/abc/def") == ["/abc", "def"])
test_ok(File.split("/abc/def.ghi") == ["/abc", "def.ghi"])
