package exercise_10;

import java.util.Arrays;

/**
 * 将数组转换成字符串来进行处理，更加效率
 */
public class VampireNumber {
    public static void main(String[] args) {
        String[] str1, str2;

        for (int i=10;i<100;i++) {
            for (int j=i+1;j<100;j++) {
                int result = i * j;
                if (result < 1000 || result > 9999) {
                    continue;
                }
                str1 = String.valueOf(result).split("");
                str2 = (String.valueOf(i) + String.valueOf(j)).split("");

                Arrays.sort(str1);//String[] 可以直接进行排序
                Arrays.sort(str2);
                if (Arrays.equals(str1, str2)) {//判断数组是否相等
                    System.out.println(result);
                }

            }

        }
    }

}
