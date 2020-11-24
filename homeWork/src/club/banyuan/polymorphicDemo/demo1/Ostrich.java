package club.banyuan.polymorphicDemo.demo1;

/**
 * @author nijing
 * @date 2020/11/24 7:09 下午
 * @override 1.0
 */
public class Ostrich extends Bird{
    private double height = 200;
    private double speed = 10;

    @Override
    public String toString() {
        return "Ostrich{" +
                "height=" + height +
                ", speed=" + speed +
                ", wing='" + wing + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
