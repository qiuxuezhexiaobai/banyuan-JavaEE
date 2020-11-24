package club.banyuan.extend.demo3;

/**
 * @author nijing
 * @date 2020/11/20 8:50 下午
 * @override 1.0
 */
public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("学习");
    }
}
