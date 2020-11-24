package club.banyuan.userDemo;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/11/18 11:07 上午
 */
public class Main {
  static UserService userService = null;
  public static void main(String[] args) {
        userService = new UserService();
        ProductService productService = new ProductService();
        productService.setUserService(userService);

        loop:

        while (true) {
            System.out.println("欢迎进入半圆电子商城");
            System.out.println("1.用户选项");
            System.out.println("2.查看商品详情");
            System.out.println("3.退出");

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入操作的选项:1:登录； 2；注册");
            String next = scanner.next();

            switch (next) {
                case "1":
                    //用户登录或者是用户的注册
                    System.out.println("欢迎进入用户操作界面");
                    System.out.println("请输入操作选项:");
                    String string = scanner.next();
                    if (string.equals("1")) {
                        //TODO 登录方法
                        User user = new User();
                        System.out.println("请输入用户名：");
                        String name = scanner.next();
                        user.setUsername(name);
                        System.out.println("请输入密码：");
                        String pwd = scanner.next();
                        user.setPassword(pwd);
                        boolean flag = userService.login(user);
                        // System.out.println("登录是否成功:" + flag);
                        if (flag) {
                            //如果登录成功去创建一个用来存放数据的容器
                            Product[] products = new Product[0];
                            //行健示范处  TODO
                            user.setProducts(products);
                            //TODO 调用显示所有商品的详情
                            productService.showAll();
                            while (true) {
                                System.out.println("请选择商品操作项，1：购买；2：移除；3:查看购物车；5：退出操作");
                                String proNumber = scanner.next();
                                switch (proNumber) {
                                    case "1":
                                        System.out.println("请选择需要购买的商品编号:");
                                        String proID = scanner.next();
                                        productService.buy(proID, user);
                                        break;
                                    case "2":
                                        //TODO 移除商品
                                        System.out.println("请选择需要删除的商品编号:");
                                        String proID2 = scanner.next();
                                        userService.removeProduct(proID2, user);
                                        break;
                                    case "3":
                                        //TODO 查看所有商品
                                        userService.printnInfo(user);
                                        break;
                                    case "4":
                                        //NOT TODO 结算  不写
                                        break;
                                    case "5":
                                        System.out.println("退出商品操作");
                                        continue loop;
                                    default:
                                        break;
                                }
                            }
                        } else {
                            //TODO  注册方法
                            System.out.println("是否去注册账号?是：1;否:0");
                            int goToRes = scanner.nextInt();
                            if(goToRes == 1){
                             register();
                            }
                        }
                    }
                    break;
                case "2":
                    register();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("其他操作...");
                    break;
            }

        }


    }

    static void register() {
        //TODO  注册方法
      Scanner scanner = new Scanner(System.in);
      System.out.println("您还未注册，请先注册!");
        User user = new User();
        System.out.println("请输入您的用户名：");
        String username = scanner.next();
        user.setUsername(username);
        System.out.println("请输入您的密码：");
        String password = scanner.next();
        user.setPassword(password);
        boolean flag = true;
        while (flag) {
            System.out.println("请再次出入您的密码");
            String checkPassword = scanner.next();
            if (checkPassword .equals(user.getPassword())) {
                flag = false;
                break;
            }else{
              System.out.println("您两次密码不一致！");
            }
        }
        if (userService.register(user)) {
            System.out.println("注册成功！");
        } else {
            System.out.println("注册失败");
        }
    }

}
