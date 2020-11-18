package club.banyuan.sale;

/**
 * @author nijing
 * @date 2020/11/17 8:27 下午
 * @override 1.0
 */
public class Employee {
    private String name;
    private double date;
    private double salary = 5000;//默认基本工资为5000

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDate() {
        return date;
    }

    /**
     * 设置工作时长
     * @param date
     */
    public void setDate(double date) {
        this.date = date;
        getSalary();
    }

    /**
     * 获取工资实际情况
     * @return
     */
    public double getSalary() {
        if(date > 196){
            salary = salary + (date - 196) * 200;
            return salary;
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }
}
