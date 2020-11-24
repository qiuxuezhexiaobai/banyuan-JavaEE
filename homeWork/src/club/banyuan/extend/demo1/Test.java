package club.banyuan.extend.demo1;

/**
 * @author nijing
 * @date 2020/11/20 5:06 下午
 * @override 1.0
 */
public class Test {
    /**
     * 长：10
     * 宽：5
     * 高 4
     * @param args
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("底面积:"+rectangle.area());
        System.out.println("体积:"+rectangle.volume());
    }

}
