package club.banyuan.extend.demo4;

/**
 * @author nijing
 * @date 2020/11/20 9:05 下午
 * @override 1.0
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("orange", 4);
        cat.catchMouse();

        Dog dog = new Dog("black", 4);
        dog.lookHouse();
    }
}
