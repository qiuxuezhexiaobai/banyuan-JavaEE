package club.banyuan.ques;

/**
 * @author nijing
 * @date 2020/11/17 6:28 下午
 * @override 1.0
 */

/**
 * 定义一个大象类
 */
public class Elephant {
    private int heightInCM = 200;

    //无参数，构造方法（默认）
    public Elephant(){}

    //有参数，构造方法
    public Elephant(int heightInCM){
        this.heightInCM = heightInCM;
    }

    public void setHeightInCM(int heightInCM){
        if(heightInCM < 0){
            System.err.println("高度不合法，给与一个默认高度200");
            this.heightInCM = 200;
            return;
        }
        this.heightInCM = heightInCM;
    }

    public int getHeightInCM(){
        return heightInCM;
    }

    @Override
    public String toString() {
        return "大象{" +
                "高度=" + heightInCM +
                '}';
    }
}
