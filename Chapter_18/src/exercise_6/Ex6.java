package exercise_6;

import net.mindview.util.ProcessFiles;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex6 {
    public static void main(String[] args) {
        String dateString = "05/25/2018";
        final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                Date modifyDate = new Date(file.lastModified());
                try {
                    Date date = sdf.parse(dateString);
                    if (modifyDate.after(date)) {
                        System.out.println(file);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }, "java").start(args);
    }
}