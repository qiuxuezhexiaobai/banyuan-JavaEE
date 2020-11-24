package club.banyuan.polymorphicDemo.demo1;

/**
 * @author nijing
 * @date 2020/11/24 7:09 下午
 * @override 1.0
 */
public class Sparrow extends Bird{
    private int age = 1;
    private double weight = 10;

    @Override
    public String toString() {
        return "Sparrow{" +
                "age=" + age +
                ", weight=" + weight +
                ", wing='" + wing + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
