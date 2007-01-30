XRuby
Xue Yong Zhi (zhixueyong AT hotmail.com)

Overview
=====================
Compile Ruby to Java Bytecode


Compile
=====================
JDK 5.0 is required to compile XRuby's source code:

On Windows:
>build.bat

On Unix:
>build.sh


Usage
=====================
Compile a ruby script then run:
>java -jar xruby-0.1.0.jar -c test.rb
>java -jar test.jar

Run script directly (compile behind the scene):
>java -jar xruby-0.1.0.jar test.rb
