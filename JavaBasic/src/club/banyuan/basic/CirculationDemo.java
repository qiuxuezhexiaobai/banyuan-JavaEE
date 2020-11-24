package JavaBasic.src.club.banyuan.basic;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/11 9:17 上午
 * @override 1.0
 */
public class CirculationDemo {
    public static void main(String[] args) {
        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println("\n");
        }*/

       /* System.out.println("请输入n行n列的乘法口诀");
        System.out.println("请输入数字");
        while(true){
            Scanner myScannner = new Scanner(System.in);
            int num = myScannner.nextInt();
            for (int i = 1; i <= num ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j + "*" + i + "=" + i * j + "\t");
                }
                System.out.println("\n");
            }
        }*/


//        int num = 0;
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                num++;
//                System.out.print(num%10);
//            }
//            System.out.println();
//        }


//        while (true){
//            Scanner scn = new Scanner(System.in);
//            System.out.println("请输入:");
//            int zero = scn.nextInt();
//            System.out.println("输入的数字是:"+zero);
//            if(zero == 0){
//                System.out.println("程序结束");
//                break;
//            }
//        }

//        Scanner numScanner = new Scanner(System.in);
//        System.out.println("请输入一个数字在50以内的数字，让电脑在5次内猜出");
//        int num2 = numScanner.nextInt();
//        if (num2 < 0 && num2 > 50) {
//            System.out.println("您输入的数字不在有效范围！");
//        }
//        int chance = 5;
//        int b = 1;
//        int min = 0;
//        int max = 50;
//        while (chance > 0) {
//            int number = (int) (Math.random() * (max - min)) + min;
//            if (number == max || number == min) {
//                continue;
//            }
//            if (num2 < number) {
//                max = number;
//                System.out.println("电脑第" + b + "次猜" + number + "！结果偏大");
//            } else if (num2 > number) {
//                min = number;
//                System.out.println("电脑第" + b + "次猜" + number + "！结果偏小");
//            } else {
//                System.out.println("电脑第" + b + "次猜" + number + "！结果正确");
//                chance = 0;
//            }
//            b++;
//            chance--;
//        }

    }
}
