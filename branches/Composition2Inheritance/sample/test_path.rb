require 'common'

test_check "path"
test_ok(File.basename("a") == "a")
test_ok(File.basename("a/b") == "b")
test_ok(File.basename("a/b/") == "b")
test_ok(File.basename("/") == "/")
test_ok(File.basename("//") == "/")
test_ok(File.basename("///") == "/")
test_ok(File.basename("a/b////") == "b")
test_ok(File.basename("a.rb", ".rb") == "a")
test_ok(File.basename("a.rb///", ".rb") == "a")
test_ok(File.basename("a.rb///", ".*") == "a")
test_ok(File.basename("a.rb///", ".c") == "a.rb")
test_ok(File.dirname("a") == ".")
test_ok(File.dirname("/") == "/")
test_ok(File.dirname("/a") == "/")
test_ok(File.dirname("a/b") == "a")
test_ok(File.dirname("a/b/c") == "a/b")
test_ok(File.dirname("/a/b/c") == "/a/b")
test_ok(File.dirname("/a/b/") == "/a")
test_ok(File.dirname("/a/b///") == "/a")
case Dir.pwd
when %r'\A\w:'
  test_ok(/\A\w:\/\z/ =~ File.expand_path(".", "/"))
  test_ok(/\A\w:\/a\z/ =~ File.expand_path("a", "/"))
  dosish = true
when %r'\A//'
  test_ok(%r'\A//[^/]+/[^/]+\z' =~ File.expand_path(".", "/"))
  test_ok(%r'\A//[^/]+/[^/]+/a\z' =~ File.expand_path(".", "/"))
  dosish = true
else
  test_ok(File.expand_path(".", "/") == "/")
  test_ok(File.expand_path("sub", "/") == "/sub")
end
if dosish
  test_ok(File.expand_path("/", "//machine/share/sub") == "//machine/share")
  test_ok(File.expand_path("/dir", "//machine/share/sub") == "//machine/share/dir")
  test_ok(File.expand_path("/", "z:/sub") == "z:/")
  test_ok(File.expand_path("/dir", "z:/sub") == "z:/dir")
end
test_ok(File.expand_path(".", "//") == "//")
test_ok(File.expand_path("sub", "//") == "//sub")

