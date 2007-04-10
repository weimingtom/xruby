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
import java.util.*;

/**
 * @author Yu Su (beanworms@gmail.com)
 */
public class SourceCodeMgr {

    private static Map<String, SourceCode> cache ;
    private static Map<String, Map<String, int[]>> blockMap;

    static {
        cache = new HashMap<String, SourceCode>();
        blockMap = new HashMap<String, Map<String, int[]>>();
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

    public static String getRealClass(String classId, int lineNumber) throws XRubyDebugException {
        //test_debug2.main -> test_debug2.BLOCK$0
        StringTokenizer st = new StringTokenizer(classId, ".");
        String scriptName;
        String className;

        if(st.hasMoreTokens()) {
            className = st.nextToken();
            scriptName =  className + ".rb";
        } else {
            throw new XRubyDebugException("IllegalArgumentExcpeiont, class");
        }

        // TODO: We should add a smap option in start options
        // TODO: put the .smap file under the same directory of .class files
        List<File> paths = DebugContext.getSourcePath();
        for (File path : paths) {
            if (path.isDirectory()) {
                String tmp = path.getAbsolutePath() + File.separatorChar + scriptName + ".smap";
                File file = new File(tmp);
                if(file.exists()) {
                    String blockName = retrieveBlockName(file, lineNumber);
                    if(blockName != null) {
                        return String.format("%s.%s", className, blockName);
                    }
                }
            }
        }

        return classId;
    }


    private static String retrieveBlockName(File mapFile, int lineNumber) throws XRubyDebugException {
        Map<String, int[]> map = blockMap.get(mapFile.getName());
        String realName = null;

        if(map == null) {  // The first time reading this file's map
            map = new HashMap<String, int[]>();
            blockMap.put(mapFile.getName(), map);
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(mapFile));
                int number = Integer.parseInt(reader.readLine());
                for(int i = 0; i < number;) {
                    String line = reader.readLine();
                    if(line.trim().equals("")) {
                        continue;
                    }

                    StringTokenizer seq = new StringTokenizer(line, " ");

                    // We assume the format is correct: [Block's Name] [start] [end]
                    String blockName = seq.nextToken();
                    String start = seq.nextToken();
                    String end = seq.nextToken();
                    int startIdx = Integer.parseInt(start);
                    int endIdx = Integer.parseInt(end);

                    if(lineNumber > startIdx && lineNumber <= endIdx) {
                        realName = blockName;
                    }

                    map.put(blockName, new int[]{startIdx, endIdx});
                    i ++;
                }
            } catch (IOException e) {
                throw new XRubyDebugException(
                        String.format("Couldn't read this file or wrong format, %s:\n%s", mapFile.getName(), e.getMessage()));
            }
        } else {  // already existed
            Set<String> blocks = map.keySet();
            for(String block: blocks) {
                int[] range = map.get(block);
                if(lineNumber > range[0] && lineNumber <= range[1]) {
                    return block;
                }
            }
        }

        return realName;
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
