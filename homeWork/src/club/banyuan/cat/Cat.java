package club.banyuan.cat;

import club.banyuan.dog.Dog;

/**
 * @author nijing
 * @date 2020/11/17 7:52 下午
 * @override 1.0
 */
public class Cat {
    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getInfo() {
        return color + type;
    }

    public void print() {
        System.out.println(getInfo());
    }

    public void playWith(Dog dog) {
        System.out.println(getInfo() + "和" + dog.getInfo() + "一起玩");
    }
}