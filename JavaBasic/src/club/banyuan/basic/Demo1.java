package JavaBasic.src.club.banyuan.basic;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/10 2:56 下午
 * @override 1.0
 */
public class Demo1 {
    /**
     *
     */
    public static void main(String[] args) {
//        while (true){
        System.out.println("请输入您的月份");
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        try {
            month = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("您输入的月份不存在");
        }
        switch (month) {
            case 11:
            case 12:
            case 1:
                System.out.println("冬季");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("春季");
                break;

            case 5:
            case 6:
            case 7:
                System.out.println("夏季");
                break;

            case 8:
            case 9:
            case 10:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份不存在");
                break;

        }

//        }
    }
}
