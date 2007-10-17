package com.xruby.compiler;

import com.xruby.runtime.lang.RubyRuntime;

/**
 * Test if ruby's standand lib work under xruby
 */
public class StdlibTest extends CompilerTestCase {

    public void setUp() {
        RubyRuntime.init(null);
    }

    public void test_test_unit_assertionfailederror() {
        String[] program_texts = {
                "require 'test/unit/assertionfailederror'",
                "print Test::Unit::AssertionFailedError.superclass",
                "begin; raise Test::Unit::AssertionFailedError.new('xxx')\n" +
                "rescue =>e; print e.message; end",
        };

        String[] outputs = {
                "",
                "StandardError",
                "xxx",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_failure() {
        String[] program_texts = {
                "require 'test/unit/failure'",
                "print Test::Unit::Failure.new('x', 'y', 'z').single_character_display",
                "print Test::Unit::Failure.new('x', 'y', 'z').short_display",
                "print Test::Unit::Failure.new('x1', [1, 2], 'z1').long_display",
                "print Test::Unit::Failure.new('x1', ['y'], 'z1').long_display",
                "print Test::Unit::Failure.new('x1', ['y'], 'z1').to_s",
        };

        String[] outputs = {
                "",
                "F",
                "x: z",
                "Failure:\nx1\n    [1\n     2]:\nz1",
                "Failure:\nx1y:\nz1",
                "Failure:\nx1y:\nz1",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_util_backtracefilter() {
        String[] program_texts = {
                "print(require('test/unit/util/backtracefilter'))",
                "print Test::Unit::Util::BacktraceFilter",
        };

        String[] outputs = {
                "true",
                "Test::Unit::Util::BacktraceFilter",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_util_procwrapper() {
        String[] program_texts = {
                "print(require('test/unit/util/procwrapper'))",
        };

        String[] outputs = {
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_util_observable() {
        String[] program_texts = {
                "print(require('test/unit/util/observable'))",
        };

        String[] outputs = {
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_testresult() {
        String[] program_texts = {
                "print(require('test/unit/testresult'))",
                "print Test::Unit::TestResult.new.to_s",
                "print Test::Unit::TestResult.new.passed?",
                "print Test::Unit::TestResult.new.failure_count",
                "print Test::Unit::TestResult.new.error_count",
                "print Test::Unit::TestResult.new.add_run",
                "a=Test::Unit::TestResult.new; print a.add_failure('xxx'), a.failure_count",
                "a=Test::Unit::TestResult.new; print a.add_error('xxx'), a.add_error('yyy'), a.error_count",
                "a=Test::Unit::TestResult.new; print a.add_assertion",
        };

        String[] outputs = {
                "true",
                "0 tests, 0 assertions, 0 failures, 0 errors",
                "true",
                "0",
                "0",
                "0",
                "01",
                "002",
                "0",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_error() {
        String[] program_texts = {
                "print(require('test/unit/error'))",
                "print Test::Unit::Error.new('name', 'excepton').single_character_display",
                "print Test::Unit::Error.new('excepton', NameError.new('message')).message",
        };

        String[] outputs = {
                "true",
                "E",
                "NameError: message",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_testcase() {
        String[] program_texts = {
                "require('test/unit/testcase')",
                "print Test::Unit::TestCase.new('name').size",
        };

        String[] outputs = {
                "",
                "1",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_testsuite() {
        String[] program_texts = {
                "require('test/unit/testsuite')",
                "print Test::Unit::TestSuite.new.to_s",
                "print Test::Unit::TestSuite.new('name').to_s",
                "print Test::Unit::TestSuite.new.empty?",
                "a = Test::Unit::TestSuite.new; a << 1; print a.empty?; a.delete 1; print a.empty?",
                "a = Test::Unit::TestSuite.new; a << 'x'; print a.size",
                "a = Test::Unit::TestSuite.new; b = Test::Unit::TestSuite.new; a << 1; print a == b",
                "a = Test::Unit::TestSuite.new; b = Test::Unit::TestSuite.new; print a == b",
                "Test::Unit::TestSuite.new('x').run('z') {|x, y| print x, y}",
        };

        String[] outputs = {
                "",
                "Unnamed TestSuite",
                "name",
                "true",
                "falsetrue",
                "1",
                "false",
                "true",
                "Test::Unit::TestSuite::STARTEDxTest::Unit::TestSuite::FINISHEDx",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_collector() {
        String[] program_texts = {
                "print(require('test/unit/collector'))",
        };

        String[] outputs = {
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_assertions() {
        String[] program_texts = {
                "require('test/unit/assertions')",
                "print (include Test::Unit::Assertions)",
                "print(build_message('xxx'))",
                "print(build_message('xxx', 'yyy'))",
                "print AssertionMessage::Template.new(['?']).count",
                "print AssertionMessage::Template.new(['?']).result([2])",
                "print AssertionMessage::Template.create('<?>').result([3])",
                "print AssertionMessage.new('x', '<?>', [1]).add_period('y')",
                "print AssertionMessage.new('x', '<?>', [1])",
                "print(build_message('xxx', '<?> is not true.', false))",
                "assert_block {true}",
        };

        String[] outputs = {
                "",
                "Object",
                "xxx.",
                "xxx.\nyyy",
                "1",
                "2",
                "<3>",
                "y.",
                "x.\n<1>",
                "xxx.\n<false> is not true.",
                "",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_test_unit_ui_testrunnerutilities() {
        String[] program_texts = {
                "print(require('test/unit/ui/testrunnerutilities'))",
        };

        String[] outputs = {
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_complex() {
        String[] program_texts = {
                "require 'complex.rb'",
                "print Complex.generic?(1)",
                "print Complex.new(0,2)",
                "print Complex::I",
        };

        String[] outputs = {
                "",
                "true",
                "2i",
                "1i",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_erb() {
        String[] program_texts = {
                "require 'erb'",
                "print ERB::Compiler.new(nil).compile('<%= print 1 %>')",
                "ERB.new('<%= print 1 %>').result",
                "print ERB.new('<% 3.times do %>1<% end %>').result",
        };

        String[] outputs = {
                "",
                "print(( print 1 ).to_s)",
                "1",
                "111",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_shellwords() {
        String[] program_texts = {
                "require 'shellwords'",
                "p Shellwords.shellwords('a b c')",
        };

        String[] outputs = {
                "",
                "[\"a\", \"b\", \"c\"]\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_singleton() {
        String[] program_texts = {
                "require 'singleton'",
                "class TestSingleton; include Singleton; end\n" +
                "print(TestSingleton.instance == TestSingleton.instance)",
        };

        String[] outputs = {
                "",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_cgi() {
        String[] program_texts = {
                "require 'cgi'",
                "print CGI::unescape('%27Stop%21%27+said+Fred')",
                "p CGI::parse('a=b')",
                "print CGI::escapeHTML('Usage: foo \"bar\" <baz>')",
                "print CGI::unescapeHTML('Usage: foo &quot;bar&quot; &lt;baz&gt;')",
                "print CGI::escapeElement('<BR><A HREF=\"url\"></A>', 'A', 'IMG')",
                "print CGI::unescapeElement(CGI::escapeHTML('<BR><A HREF=\"url\"></A>'), 'A', 'IMG')",
        };

        String[] outputs = {
                "",
                "'Stop!' said Fred",
                "{\"a\"=>[\"b\"]}\n",
                "Usage: foo &quot;bar&quot; &lt;baz&gt;",
                "Usage: foo \"bar\" <baz>",
                "<BR>&lt;A HREF=&quot;url&quot;&gt;&lt;/A&gt;",
                "&lt;BR&gt;<A HREF=\"url\"></A>",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    /*TODO
    public void test_matrix() {
        String[] program_texts = {
                "require 'matrix'",
        };

        String[] outputs = {
                "",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }*/

    public void test_rational() {
        String[] program_texts = {
                "require 'rational'",
                "print Rational(3,4).to_s",

                "print Rational(+7,4).to_i",
                "print Rational(-7,4).to_i",

                "print Rational(+7,4).to_f",

                "print Rational(3,4) / 2",
                "print Rational(3,4) / 2.0",

                "print Rational(3,4) * 2",

                "print Rational(7,4) % Rational(1,2)",
                "print Rational(3,4) % 1",
                "print Rational(3,4) % Rational(1,7)",

                "print Rational(3,4) ** 2",

                "print Rational(-3,5).abs",

                "print Rational(-3,2) == Rational(-3,2) ",

                "print Rational(-3,2) <=> Rational(-3,2) ",
        };

        String[] outputs = {
                "",
                "3/4",

                "1",
                "-2",

                "1.75",

                "3/8",
                "0.375",

                "3/2",

                "1/4",
                "3/4",
                "1/28",

                "9/16",

                "3/5",

                "true",

                "0",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }
}
