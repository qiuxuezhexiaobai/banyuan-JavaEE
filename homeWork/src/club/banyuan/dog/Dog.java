package club.banyuan.dog;

import club.banyuan.cat.Cat;

/**
 * @author nijing
 * @date 2020/11/17 7:44 下午
 * @override 1.0
 */
public class Dog {
    private String type;
    private int dogIQ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDogIQ() {
        return dogIQ;
    }

    public void setDogIQ(int dogIQ) {
        this.dogIQ = dogIQ;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", dogIQ=" + dogIQ +
                '}';
    }

    public String getInfo(){
        String describe = "";
        if(dogIQ<20){
            describe="傻";
        }else if(dogIQ < 80){
            describe="普通的";
        }else{
            describe="聪明的";
        }
        return describe+type;
    }

    public void printInfo(){
        System.out.println(getInfo());
    }
    public void playWith(Cat cat){
        System.out.println(type+"和"+cat.getType()+"一起玩");
    }
}
