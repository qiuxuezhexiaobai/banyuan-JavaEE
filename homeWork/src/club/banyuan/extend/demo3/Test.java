package club.banyuan.extend.demo3;

/**
 * @author nijing
 * @date 2020/11/20 9:01 下午
 * @override 1.0
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("老师");
        teacher.setAge(18);
        teacher.teach();

        Student student = new Student();
        student.setName("小明");
        student.setAge(5);
        student.study();
    }
}
