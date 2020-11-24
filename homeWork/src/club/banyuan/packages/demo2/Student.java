package club.banyuan.packages.demo2;

/**
 * @author nijing
 * @date 2020/11/20 9:21 下午
 * @override 1.0
 */
public class Student {
    private String name;
    private String sex;
    private int age;
    private String dire;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() <0 || name.length() > 4 ){
            System.out.println("姓名不符合规范");
            return;
        }
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.equals("男") && !sex.equals("女")){
            System.out.println("男或者女才行");
            return;
        }
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<1 || age>60){
            System.out.println("年龄不达标");
            return;
        }
        this.age = age;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        if (!dire.equals(".net") && !dire.equals("java")){
            System.out.println("方向只能是.net或者java");
            return;
        }
        this.dire = dire;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dire='" + dire + '\'' +
                '}';
    }
}
