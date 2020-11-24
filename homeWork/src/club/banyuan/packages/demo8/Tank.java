package club.banyuan.packages.demo8;

/**
 * @author nijing
 * @date 2020/11/20 9:50 下午
 * @override 1.0
 */
public class Tank {
    private double x;
    private double y;
    private String dir;
    private String type;

    public Tank() {
    }

    public Tank(double x, double y, String dir, String type) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.type = type;
    }

    public String showData(){
        return toString();
    }

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", dir='" + dir + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
