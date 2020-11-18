package club.banyuan.ques;

/**
 * @author nijing
 * @date 2020/11/17 6:36 下午
 * @override 1.0
 */
public class Fridge {
    private int heightInCM;
    private Elephant elephant;
    private Lion lion;

    public int getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(int heightInCM) {
        this.heightInCM = heightInCM;
    }

    public Elephant getElephant() {
        return elephant;
    }

    public void setElephant(Elephant elephant) {
        this.elephant = elephant;
    }

    public Lion getLion() {
        return lion;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }

    //大象移除冰箱方法
    Elephant remove() {
        if (elephant != null){
            Elephant info = elephant;
            elephant = null;
            return info;
        }
        return null;
    }

    Object removeAnimal(){
        if(!isEmpty()){
            if (elephant != null){
                Elephant info = elephant;
                elephant = null;
                return info;
            }
            if (lion != null){
                Lion info = lion;
                lion = null;
                return info;
            }
        }
        return null;
    }

    /**
     * 判断冰箱是否为空
     * @return
     */
    boolean isEmpty(){
        if(this.lion == null && this.elephant == null){
            return true;
        }else{
            System.out.println("冰箱已经满了！");
        }
        return false;
    }

    /**
     * 单独将大象装进冰箱
     */
    public void store(Elephant elephant){
        if(isEmpty()){
            this.elephant = elephant;
        }
    }
    /**
     * 单独将狮子装进冰箱
     */
    public void store(Lion lion){
        if(isEmpty()){
            this.lion = lion;
        }
    }

    //打印冰箱信息
    void printFridgeInfo(Elephant el){
        if(this.elephant != null){
            System.out.printf("%d厘米高的冰箱中，保存了一个%d厘米高的大象\n", heightInCM,
                    el.getHeightInCM());
        }
    }
    void printFridgeInfo(Lion lion){
        if(this.lion != null){
            System.out.printf("%d厘米高的冰箱中，保存了一个%d厘米高的狮子\n", heightInCM,
                    lion.getHeightInCM());
        }
    }

}
