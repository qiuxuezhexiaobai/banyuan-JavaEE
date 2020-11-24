package club.banyuan.abstractDemo.demo4;

/**
 * @author nijing
 * @date 2020/11/24 6:57 下午
 * @override 1.0
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role() {
        this("张三",18,"女");
    }

    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void play();
}
