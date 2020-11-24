package club.banyuan.extend.demo1;

/**
 * @author nijing
 * @date 2020/11/20 4:57 下午
 * @override 1.0
 */
public class Rectangle extends SuperRectangle{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 计算体积
     */
    public double volume(){
        return length * getHeight() * getWidth();
    }
    /**
     * 计算底面积
     */
    @Override
    public double area(){
        return length*getWidth();
    }
}
