package JavaBasic.src.club.banyuan.homework;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/12 8:26 上午
 * @override 1.0
 */
public class HomeWork4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("输入一个 单位是byte的字节数");
            Scanner myScan = new Scanner(System.in);
            long num = myScan.nextLong();
            System.out.println(formateByte(num));
        }
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
        String unit = "";

        int integerNum = 0;
        int remainder = 0;

        if (len < 4) {
            unit += "B";
            integerNum = (int) bytes;
        } else if (len < 7) {
            unit += "kB";
            integerNum = (int) bytes / 1000;
            remainder = (int) bytes % 1000;
        } else if (len < 10) {
            unit += "MB";
            integerNum = (int) bytes / 1000000;
            remainder = (int) bytes % 1000000;
        } else if (len < 13) {
            unit += "GB";
            integerNum = (int) bytes / 1000000000;
            remainder = (int) bytes % 1000000000;
        } else if (len < 19) {
            unit += "TB";
            integerNum = (int) ((int) bytes / 1000000000000L);
            remainder = (int) ((int) bytes % 1000000000000L);
        } else if (len < 23) {
            unit += "PB";
            integerNum = (int) ((int) bytes / 1000000000000000L);
            remainder = (int) ((int) bytes % 1000000000000000L);
        } else if(len < 25) {
            unit += "EB";
            integerNum = (int) ((int) bytes / 1000000000000000000L);
            remainder = (int) ((int) bytes % 1000000000000000000L);
        }else{
            unit += "YB";
//            integerNum = (int) ((int) bytes / 1000000000000000000000L);
//            remainder = (int) ((int) bytes % 1000000000000000000000L);
        }
        return integerNum + "." + remainder + unit;
    }
}
