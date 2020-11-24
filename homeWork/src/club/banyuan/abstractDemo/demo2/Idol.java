package club.banyuan.abstractDemo.demo2;

/**
 * @author nijing
 * @date 2020/11/24 6:42 下午
 * @override 1.0
 */
public class Idol extends Sing implements Jump,Rap {
    @Override
    public void jump() {
        System.out.println("跳");
    }

    @Override
    public void rap() {
        System.out.println("rap");
    }

    @Override
    public void Sing() {
        System.out.println("唱");
    }
}
