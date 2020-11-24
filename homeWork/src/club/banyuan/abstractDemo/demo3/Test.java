package club.banyuan.abstractDemo.demo3;

/**
 * @author nijing
 * @date 2020/11/24 6:47 下午
 * @override 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("小明");
        p1.choseVehicle("坐大巴");
        System.out.println(p1);

        Person p2 = new Person();
        p2.setName("小王");
        p2.choseVehicle("坐火车");
        System.out.println(p2);

        Person p3 = new Person();
        p3.setName("小李");
        p3.choseVehicle("坐飞机");
        System.out.println(p3);
    }
}
