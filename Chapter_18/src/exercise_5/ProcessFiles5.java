package exercise_5;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
//: net/mindview/util/ProcessFiles5.java
import net.mindview.util.Directory;

import java.io.*;
import java.util.regex.Pattern;

public class ProcessFiles5 {
    public interface Strategy {
        void process(File file);
    }
    private Strategy strategy;
    private String regex;
    public ProcessFiles5(Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = regex;
    }
    public void start(String[] args) {
        try {
            if(args.length == 0)
                processDirectoryTree(new File("."));
            else
                for(String arg : args) {
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
                        // Allow user to leave off extension:
                        Pattern pattern = Pattern.compile(regex);
                        if (pattern.matcher(arg).matches()) {
                            strategy.process(
                                    new File(arg).getCanonicalFile());
                        }

                    }
                }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void
    processDirectoryTree(File root) throws IOException {
        for(File file : Directory.walk(
                root.getAbsolutePath(), regex))
            strategy.process(file.getCanonicalFile());
    }
    // Demonstration of how to use it:
    public static void main(String[] args) {
        new ProcessFiles5(new ProcessFiles5.Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, "java").start(args);
    }
} /* (Execute to see output) *///:~
