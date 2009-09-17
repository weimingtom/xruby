@echo off
java -cp lib/ant/ant-1.7.0.jar;lib/ant/ant-launcher-1.7.0.jar;lib/ant/ant-antlr-1.7.0.jar;lib/ant/ant-junit-1.7.0.jar;lib/junit/junit-3.8.1.jar;"%JAVA_HOME%/lib/tools.jar" org.apache.tools.ant.Main %1
