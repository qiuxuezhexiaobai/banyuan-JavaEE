package club.banyuan.extend.demo1;

/**
 * @author nijing
 * @date 2020/11/20 4:57 下午
 * @override 1.0
 */
public class SuperRectangle {
    private double width;
    private double height;

    public SuperRectangle() {
    }

    public SuperRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    /**
     * area
     * @return
     */
    public double area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "SuperRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
