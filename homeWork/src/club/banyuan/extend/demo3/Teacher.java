package club.banyuan.extend.demo3;

/**
 * @author nijing
 * @date 2020/11/20 8:50 下午
 * @override 1.0
 */
public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("讲课");
    }
}
