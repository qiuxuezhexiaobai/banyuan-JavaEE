package club.banyuan.sale;

/**
 * @author nijing
 * @date 2020/11/17 9:31 下午
 * @override 1.0
 */
public class Main {
    static Compony compony = null;
    public static void main(String[] args) {
        compony = new Compony();

        Employee e1 = new Employee();
        initEmp(e1, "张三", 205);

        Employee e2 = new Employee();
        initEmp(e2, "李四", 220);


        Employee e3 = new Employee();
        initEmp(e3, "王五", 180);


        Employee e4 = new Employee();
        initEmp(e4, "陆六", 196);

        compony.remove("李四");
        System.out.println(compony.show("张三"));
        System.out.println("工资总和:"+compony.sum());
    }
    static void initEmp(Employee el, String name, double date, double salary){
        el.setName(name);
        el.setDate(date);
        el.setSalary(salary);
        compony.add(el);
    }
    static void initEmp(Employee el, String name, double date){
        el.setName(name);
        el.setDate(date);
        compony.add(el);
    }

}
