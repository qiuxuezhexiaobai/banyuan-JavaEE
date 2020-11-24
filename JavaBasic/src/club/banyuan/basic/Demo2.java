package JavaBasic.src.club.banyuan.basic;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/10 3:53 下午
 * @override 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        while (true) {
            Scanner myCanner = new Scanner(System.in);
            System.out.println("请输入年份");
            int year = myCanner.nextInt();
            Boolean isLeap = false;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                isLeap = true;
                System.out.println("注意:" + year + "年是闰年");
            }
            System.out.println("请输入月份");
            int month = myCanner.nextInt();
            System.out.println("请输入几号");
            int date = myCanner.nextInt();

            int sum = 0;

            /**
             * 1,3,5,7,8,10,12     31天
             * 4,6,9,11    30天
             * 2  闰年 29天
             */
            switch (month - 1) {
                case 11:
                    sum += 30;
                case 10:
                    sum += 31;
                case 9:
                    sum += 30;
                case 8:
                    sum += 31;
                case 7:
                    sum += 31;
                case 6:
                    sum += 30;
                case 5:
                    sum += 31;
                case 4:
                    sum += 30;
                case 3:
                    sum += 31;
                case 2:
                    if (isLeap) {
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                case 1:
                    sum += 31;
                case 0:
                    sum += date;
                    break;
                default:
                    sum = 0;
                    break;
            }
            System.out.println("sum是2020年的第" + sum + "天");
        }
    }
}
