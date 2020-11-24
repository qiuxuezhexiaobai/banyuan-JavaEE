package club.banyuan.extend.demo4;

/**
 * @author nijing
 * @date 2020/11/20 8:58 下午
 * @override 1.0
 */
public class Cat extends Animals{
    public Cat() {
    }

    public Cat(String hair, int leg) {
        super(hair, leg);
    }

    public void catchMouse(){
        System.out.println("捉老鼠");
    }
}
