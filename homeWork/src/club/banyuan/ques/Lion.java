package club.banyuan.ques;

/**
 * @author nijing
 * @date 2020/11/17 6:36 下午
 * @override 1.0
 */
public class Lion {
    private int heightInCM = 100;

    public Lion(){

    }
    public Lion(int heightInCM){
        this.heightInCM = heightInCM;
    }

    public int getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(int heightInCM) {
        if (heightInCM < 0) {
            System.err.println("高度不合法，给与一个默认高度100");
            this.heightInCM = 100;
            return;
        }
        this.heightInCM = heightInCM;
    }

    @Override
    public String toString() {
        return "狮子{" +
                "高度=" + heightInCM +
                '}';
    }
}
