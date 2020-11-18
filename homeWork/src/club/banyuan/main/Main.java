package club.banyuan.main;

import club.banyuan.cat.Cat;
import club.banyuan.dog.Dog;

/**
 * @author nijing
 * @date 2020/11/17 7:56 下午
 * @override 1.0
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        setTypeInfo(dog1, "哈士奇", -100, null);
        Dog dog2 = new Dog();
        setTypeInfo(dog2, "金毛", 100, null);
        Dog dog3 = new Dog();
        setTypeInfo(dog3, "柯基", 40, null);

        Cat cat1 = new Cat();
        setTypeInfo(cat1, "波斯", 0, "白色");
        Cat cat2 = new Cat();
        setTypeInfo(cat2, "英短", 0, "黑色");
        playWith(dog1, cat1);
        playWith(cat2, dog3);
    }
    static void playWith(Dog dog, Cat cat){
        dog.playWith(cat);
    }
    static void playWith(Cat cat, Dog dog){
        cat.playWith(dog);
    }
    static void setTypeInfo(Object ob, String type, int iq, String color){
        if(color == null){
            Dog dog = (Dog)ob;
            dog.setType(type);
            dog.setDogIQ(iq);
            dog.printInfo();
        }else{
            Cat cat = (Cat)ob;
            cat.setType(type);
            cat.setColor(color);
            cat.print();
        }
    }
}
