#!/bin/sh
#For Cygwin, please use build.bat

DIRLIBS="`ls lib/**/**`"

for i in ${DIRLIBS}
do 
	if [ "$i" != "${DIRLIBS}" ] ; then
	    if [ -z "$LOCALCLASSPATH" ] ; then
		LOCALCLASSPATH=$i
	    else
		LOCALCLASSPATH="$i":$LOCALCLASSPATH
	    fi
	fi
done

java -cp "${LOCALCLASSPATH}:$JAVA_HOME/lib/tools.jar" org.apache.tools.ant.Main $1
