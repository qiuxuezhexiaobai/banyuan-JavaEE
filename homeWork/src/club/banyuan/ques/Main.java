package club.banyuan.ques;

/**
 * @author nijing
 * @date 2020/11/17 6:27 下午
 * @override 1.0
 */
public class Main {
    public static void main(String[] args) {
        Lion l1 = createLion(300);
        Elephant e1 = createElephant(400);
        Fridge f1 = createFridge(500);
        f1.store(e1);
        f1.printFridgeInfo(e1);
        System.out.println("从冰箱中移走的动物信息:"+f1.removeAnimal());
        f1.store(l1);
        f1.printFridgeInfo(l1);
        //System.out.println("从冰箱中移走的动物信息:"+f1.removeAnimal());
        f1.isEmpty();
    }

    static Lion createLion(int heightInCM){
        System.out.printf("创建一个%d厘米高的狮子！\n", heightInCM);
        Lion lion = new Lion(heightInCM);
        return lion;
    }

    static Elephant createElephant(int heightInCM){
        System.out.printf("创建一个%d厘米高的大象！\n", heightInCM);
        Elephant elephant = new Elephant(heightInCM);
        return elephant;
    }

    static Fridge createFridge(int heightInCM) {
        System.out.printf("创建一个%d厘米高的冰箱！\n", heightInCM);
        // 通过new 创建类的对象
        Fridge fridge = new Fridge();
        fridge.setHeightInCM(heightInCM);
        return fridge;
    }
}
