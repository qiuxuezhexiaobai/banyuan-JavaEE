package club.banyuan.cake;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/23 6:50 下午
 * @override 1.0
 */
public class ReadyMadeCake extends Cake{
    private int quantity;
    public ReadyMadeCake(int n, double r) {
        super(n, r);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return price*quantity;
    }

    @Override
    public String toString() {
        return "蛋糕按数量卖{" +
                "蛋糕id=" + id+
                "蛋糕价格="+price+
                "蛋糕数量=" + quantity +
                '}';
    }
}
