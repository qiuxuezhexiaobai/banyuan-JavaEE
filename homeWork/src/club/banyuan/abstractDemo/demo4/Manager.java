package club.banyuan.abstractDemo.demo4;

/**
 * @author nijing
 * @date 2020/11/24 7:03 下午
 * @override 1.0
 */
public class Manager extends Employee{

    private final String vehicle = "双腿";

    public Manager(double salary) {
        super(salary);
    }

    public Manager(String name, int age, String sex, double salary) {
        super(name, age, sex, salary);
    }

    public static void main(String[] args) {
        Employee employee = new Manager("张三",18,"女",5000);
        employee.play();
        employee.sing();
        Role role = new Employee("李四",20,"男",8888);
        role.play();
    }
}
