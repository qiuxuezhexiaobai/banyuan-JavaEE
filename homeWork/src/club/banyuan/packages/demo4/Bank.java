package club.banyuan.packages.demo4;

/**
 * @author nijing
 * @date 2020/11/20 9:35 下午
 * @override 1.0
 */
public class Bank {
    private String id;
    private String name;
    private String openTime;
    private String idCard;
    private double money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void deposit(double money){
        if(money < 0){
            System.out.println("存款金额不对");
            return;
        }
        System.out.println("存款成功");
    }

    public void drawMoney(double money){
        if(money > this.money){
            System.out.println("取款金额不能大于存款金额");
            return;
        }
        System.out.println("取款成功");
    }
}
