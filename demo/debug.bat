@echo off
java -cp lib/ant/ant-1.6.5.jar;lib/ant/ant-launcher-1.6.5.jar;lib/ant/ant-antlr-1.6.5.jar;lib/ant/ant-junit-1.6.5.jar;lib/junit/junit-3.8.1.jar;xruby-0.2.0.jar;"%JAVA_HOME%/lib/tools.jar" com.xruby.debug.cmd.CommandLineFrontEnd %*
