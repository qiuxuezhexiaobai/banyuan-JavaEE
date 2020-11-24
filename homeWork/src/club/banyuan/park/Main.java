package club.banyuan.park;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/18 3:55 下午
 * @override 1.0
 */
public class Main {
    static CarService carService = null;
    public static void main(String[] args) {
        init();
    }

    static void init() {
        carService = new CarService(30);//设置车库最多能存放多少量车
        operation();
    }

    private static void operation() {
        boolean flag = true;
        while (flag) {
            System.out.println(" *** 欢迎来到半圆租车系统 ***");
            System.out.println("1.添加入库车辆");
            System.out.println("2.移除入库车辆");
            System.out.println("3.查询所有的入库车辆信息");
            System.out.println("4.查询所有 您输入品牌名 的所有的车辆信息");
            System.out.println("5.退出租车系统\n");
            System.out.println("0.退出");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
             switch (index) {
                case 0:
                case 5:
                    flag = false;
                    break;
                case 1:
                    Car car1 = new Car();
                    System.out.println("请输入车牌号：");
                    String id = scanner.next();
                    car1.setCarId(id);
                    System.out.println("请输入车品牌：");
                    String brand = scanner.next();
                    car1.setCarBrand(brand);
                    carService.addCar(car1);
                    break;
                case 2:
                    System.out.println("请输入删除车辆车牌号:");
                    String carId = scanner.next();
                    System.out.println("删除车辆信息："+ carService.removeCar(carId));
                    break;
                case 3:
                    carService.showInfoAll();
                    break;
                case 4:
                    System.out.println("请输入查询车辆品牌:");
                    String cartBrand = scanner.next();
                    System.out.println(Arrays.toString( carService.getByCarBrand(cartBrand)));
                    break;
            }
        }
    }
}
