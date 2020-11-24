package club.banyuan.extend.demo4;

/**
 * @author nijing
 * @date 2020/11/20 8:56 下午
 * @override 1.0
 */
public class Animals {
    private String hair;
    private int leg;

    public Animals() {
    }

    public Animals(String hair, int leg) {
        this.hair = hair;
        this.leg = leg;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "hair='" + hair + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
