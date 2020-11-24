package club.banyuan.cake;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/23 6:52 下午
 * @override 1.0
 */
public class TestCake {
    static Cake[] cakes = new Cake[10];
    static int sum = 0;
    static int readyNum = 0;
    static double readyAllSum = 0;
    static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请选择以下操作:");
            System.out.println("1:添加蛋糕");
            System.out.println("0:停止添加蛋糕，并打印结果");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("输入蛋糕数据:");
                    System.out.println("请输入蛋糕重量：");
                    double weight = scanner.nextDouble();
                    System.out.println("请输入蛋糕数量：");
                    int nums = scanner.nextInt();
                    System.out.println("请输入蛋糕价格:");
                    double price = scanner.nextDouble();
                    Cake cakeItem;
                    if (index % 2 == 0) {
                        ReadyMadeCake readyMadeCake = new ReadyMadeCake(index, price);
                        readyMadeCake.setQuantity(nums);
                        double price2 = readyMadeCake.calcPrice();
                        System.out.println(price2);
                        readyAllSum += price2;
                        sum += price2;
                        cakeItem = readyMadeCake;
                        readyNum++;

                    } else {
                        OrderCake orderCake = new OrderCake(index, price);
                        orderCake.setWeightInKG(weight);
                        double price2 = orderCake.calcPrice();
                        System.out.println(price2);
                        sum += price2;
                        cakeItem = orderCake;
                    }
                    cakes[index] = cakeItem;
                    index++;
                    if(index > 9){
                        prinf();
                        flag = false;
                    }
                    break;
                case 0:
                    prinf();
                    flag = false;
                    break;
            }

        }
    }
    static void prinf(){
        System.out.println("所有蛋糕的总价:" + sum);
        System.out.println("ReadyMadeCake蛋糕的总价是:" + readyAllSum + "和数量是:" + readyNum);
        Cake max = null;
        if (cakes[0] != null){
            max = cakes[0];
            for (int i = 1; i < cakes.length; i++) {
                if(cakes[i] != null){
                    max = max.calcPrice() < cakes[i].calcPrice() ? cakes[i] : max;
                }                        }
        }
        System.out.println("最高价格出售的蛋糕的信息:"+max);
    }
}
