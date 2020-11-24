package club.banyuan.cake;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/23 6:50 下午
 * @override 1.0
 */
public class OrderCake extends Cake{
    private double weightInKG;
    public OrderCake(int n, double r) {
        super(n, r);
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }

    @Override
    public double calcPrice() {
        return price*weightInKG;
    }

    @Override
    public String toString() {
        return "蛋糕按重量卖{" +
                "蛋糕id=" + id+
                "蛋糕价格="+price+
                "重量=" + weightInKG +
                "千克}";
    }
}
