package JavaBasic.src.club.banyuan.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/11 7:33 下午
 * @override 1.0
 */
public class Homework2 {
    public static void main(String[] args) {
        System.out.println("输入一个 单位是byte的字节数");
        Scanner myScan = new Scanner(System.in);
        long num = myScan.nextLong();
        System.out.println(formateByte(num));
    }

    /**
     * 1KB=1024B  1000                                    4
     * 1MB=1024KB 1000 000                                7   3
     * 1GB=1024MB 1000 000 000                            10  6
     * 1TB=1024GB 1000 000 000 000                        13  9
     * 1PB=1024TB 1000 000 000 000 000                    16  12
     * 1EB=1024PB 1000 000 000 000 000 000                19  15
     * 1ZB=1024EB 1000 000 000 000 000 000 000            23  18
     * 1YB=1024ZB 1000 000 000 000 000 000 000 000        25  21
     */
    static String formateByte(long bytes) {
        String byteStr = bytes + "";
        int len = byteStr.length();
        int index = 0; //加点 分隔的位置
        if (len < 4) {
            byteStr += "B";
        } else if (len < 7) {
            index = len - 3;
            byteStr += "kB";
        } else if (len < 10) {
            index = len - 6;
            byteStr += "MB";
        } else if (len < 13) {
            index = len - 9;
            byteStr += "GB";
        } else if (len < 19) {
            index = len - 12;
            byteStr += "TB";
        } else if (len < 23) {
            index = len - 15;
            byteStr += "PB";
        } else if(len < 25) {
            index = len - 18;
            byteStr += "EB";
        }else{
            index = len - 21;
            byteStr += "YB";
        }
        char[] charArr = byteStr.toCharArray();
        char[] newArr = new char[charArr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if(i<index){
                newArr[i] = charArr[i];
            }else if(i>index){
                newArr[i] = charArr[i-1];
            }else{
                newArr[i] = '.';
            }
        }
        System.out.println(Arrays.toString(newArr));



        String result ="";
        for (int i = 0; i < newArr.length; i++) {
            result+=newArr[i];
        }
        return len>3 ? result: byteStr;
    }
}
