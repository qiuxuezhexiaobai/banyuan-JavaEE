package club.banyuan.extend.demo4;

/**
 * @author nijing
 * @date 2020/11/20 9:00 下午
 * @override 1.0
 */
public class Dog extends Animals{
    public Dog() {
    }

    public Dog(String hair, int leg) {
        super(hair, leg);
    }

    public void lookHouse(){
        System.out.println("看家");
    }
}
