package club.banyuan.polymorphicDemo.demo1;

/**
 * @author nijing
 * @date 2020/11/24 7:10 下午
 * @override 1.0
 */
public class Eagle extends Bird{
    private String catchFood = "从天而下";
    private double flyHeight = 100;

    @Override
    public String toString() {
        return "Eagle{" +
                "catchFood='" + catchFood + '\'' +
                ", flyHeight=" + flyHeight +
                ", wing='" + wing + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
