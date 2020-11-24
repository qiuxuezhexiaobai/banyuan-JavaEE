package club.banyuan.packages.demo2;

/**
 * @author nijing
 * @date 2020/11/20 9:27 下午
 * @override 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setSex("男");
        student.setDire(".net");
        System.out.println(student);
    }
}
