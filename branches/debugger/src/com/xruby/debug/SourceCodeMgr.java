/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author Yu Su (beanworms@gmail.com)
 */
public class SourceCodeMgr {

    private static Map<String, SourceCode> cache ;

    static {
        cache = new HashMap<String, SourceCode>();
    }

    // TODO: handle exception
    // TODO: handle possible naming conflict
    // TODO: This method should take a location instance as its parameter.
    public static String sourceLine(String sourceFile, int lineNumber) {
        if(cache.containsKey(sourceFile)) {
            return cache.get(sourceFile).sourceLine(lineNumber);
        }

        List<File> paths = DebugContext.getSourcePath();
        for (File path : paths) {
            if (path.isDirectory()) {
                String tmp = path.getAbsolutePath() + File.separatorChar + sourceFile;
                File file = new File(tmp);
                if(file.exists()) {
                    try {
                        SourceCode sc = new SourceCode(file);
                        cache.put(sourceFile, sc);
                        return sc.sourceLine(lineNumber);
                    } catch (XRubyDebugException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return null;
    }
}

class SourceCode {
    private List<String> lines;
    private File file;

    SourceCode(File file) throws XRubyDebugException {
        this.file = file;
        lines = new ArrayList<String>();
        if (!file.exists()) {
            throw new XRubyDebugException(String.format("%s doesn't exist", file.getName()));
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String sourceLine(int lineNumber) {
        return lines.get(lineNumber - 1);
    }
}
