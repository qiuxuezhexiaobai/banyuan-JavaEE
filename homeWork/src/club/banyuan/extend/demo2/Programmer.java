package club.banyuan.extend.demo2;

/**
 * @author nijing
 * @date 2020/11/20 5:19 下午
 * @override 1.0
 */
public class Programmer extends Person{
    public String work(){
        return "姓名:"+ getName() +";工号:"+getId()+";职位：程序员;工资:"+getSalary();
    }
}
