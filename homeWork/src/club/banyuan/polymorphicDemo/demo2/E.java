package club.banyuan.polymorphicDemo.demo2;

/**
 * @author nijing
 * @date 2020/11/24 7:16 下午
 * @override 1.0
 */
public class E {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.speak();
        Monkey p1 = new People();
        p1.speak();
        People p = new People();
        p.speak();
        p.think();
    }
}
