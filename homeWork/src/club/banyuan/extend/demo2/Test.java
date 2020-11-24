package club.banyuan.extend.demo2;

/**
 * @author nijing
 * @date 2020/11/20 8:44 下午
 * @override 1.0
 */
public class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setId("10086");
        programmer.setName("张三");
        programmer.setSalary(10000);

        Manager manager = new Manager();
        manager.setId("12580");
        manager.setName("李四");
        manager.setSalary(12000);
        manager.setBonus(5000);

        System.out.print(programmer.work()+"\n"+manager.work());
    }
}
