package club.banyuan.packages.demo5;

/**
 * @author nijing
 * @date 2020/11/20 9:42 下午
 * @override 1.0
 */
public class Rectangle {
    private double length = 1;
    private double width = 1;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter(){
        return (length+width)*2;
    }

    public double area(){
        return length*width;
    }
}
