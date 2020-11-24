package JavaBasic.src.club.banyuan.basic;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/10 3:53 下午
 * @override 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        /**
         * 1. 请思考验证当float类型变量中保存了超出了int所能表示的范围的数字，
         * 将这个变量强制转换为int数据类型后，int数据类型变量中保存的值是多少
         */
        float f1 = Integer.MAX_VALUE + 1;
        int result = (int) f1;
        System.out.println("f1的值是:" + f1 + "\n result的数值是：" + result);

        /**
         *
         * 2. 编写示例证明`||`会出现短路而`|`是不会短路的
         */
        int a = 11;
        if (a++ > 10 | a++ < 11) {
            System.out.println("a的值是：" + a);
        }
        int b = 11;
        if (b++ > 10 || b++ < 11) {
            System.out.println("b的值是：" + b);
        }
        /**
         * 3. 任意输入三个数,求这三个数中的最大值
         */
            Scanner myScanner = new Scanner(System.in);
            System.out.println("请输入第一个数字");
            int num1 = myScanner.nextInt();
            System.out.println("请输入第二个数字");
            int num2 = myScanner.nextInt();
            System.out.println("请输入第三个数字");
            int num3 = myScanner.nextInt();
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("最大数值是:" + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("最大数值是:" + num2);
            } else {
                System.out.println("最大数值是:" + num3);
            }
    }
}
