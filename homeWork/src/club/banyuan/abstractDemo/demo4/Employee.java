package club.banyuan.abstractDemo.demo4;

/**
 * @author nijing
 * @date 2020/11/24 7:00 下午
 * @override 1.0
 */
public class Employee extends Role{
    private double salary;
    private static String id;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    @Override
    public void play() {

    }
    public final void sing(){

    }
}
