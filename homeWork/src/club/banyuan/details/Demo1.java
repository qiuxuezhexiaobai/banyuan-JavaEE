package club.banyuan.details;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/12 3:41 下午
 * @override 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        //System.out.println(((12==0) & (1/0 < 1)));
        //第一题
        //figure(3);
        //第二题
        /**
         * oct: 表示返回八进制结果
         * bin：表示返回二进制结果
         * dec：表示返回十进制结果
         * hex: 表示返回十六进制结果
         */
        System.out.println(hexadecimalAdd(0xBCD, 0x2F, "hex"));
        //第三题
        System.out.println(hexadecimalAdd(0B10011101, 0, "oct"));
        System.out.println(hexadecimalAdd(0B10011101, 0, "hex"));

        /**
         * 变量的特点
         * 数据类型 名称 = 数值；
         * 数据类型 名称；
         * 名称 = 数值；
         * 1、先在内存中开辟一个设定数据类型的存储空间， 然后将你设定的值存入 存储空间
         * 2、可以先声明类型，然后在使用变量之前 进行赋值。
         * 3、变量的数值，可以根据需求动态改变。
         * 4、变量分为成员变量 以及局部变量，
         * 成员变量就是某个类的对象所具有的属性，
         * 而局部变量是某个方法内临时定义的变量，它的生命周期随着方法执行结束而结束。
         * 但是成员变量要等到对象销毁才会销毁。
         *
         */


        short price = 100;
        short realPrice = (short) (price * 8 / 10);
        System.out.println(price + "~" + realPrice);

        char c1='A';
        System.out.println((char)('A' + 32));
        System.out.println(1+2+"aa"+3);

        int a=2, b=3;
        System.out.println(a%b*4%b);
        System.out.println((12==0) && (1/0 < 1));
        System.out.println('1'+2);
        double a1=6.5, b2=6.5;
        System.out.println(a++>a--);
        
    }


    /**
     * 1.手动输入任意三个数，求三个数的和，差
     */
    private static void figure(int nums) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int andResult = 0, diffResult = 0;
        while (index < nums) {
            System.out.println("请输人第" + (index + 1) + "个数");
            int num1 = sc.nextInt();
            andResult += num1;
            if (index == 0) {
                diffResult += num1;
            } else {
                diffResult -= num1;
            }
            index++;
        }
        System.out.println("它们的和是:" + andResult + "~~~~~它们的差是:" + diffResult);
    }

    /**
     * 求BCD+2F的值
     */
    private static String hexadecimalAdd(int a, int b, String str) {
        String result = null;
        switch (str) {
            case "bin":
                result = Integer.toBinaryString(a + b);
                break;
            case "oct":
                result = Integer.toOctalString(a + b);
                break;
            case "dec":
                result = a + b + "";
                break;
            case "hex":
                result = Integer.toHexString(a + b);
                break;
            default:
                break;
        }
        return result;
    }
}
