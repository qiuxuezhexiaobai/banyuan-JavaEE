package club.banyuan.packages.demo9;

/**
 * @author nijing
 * @date 2020/11/20 9:52 下午
 * @override 1.0
 */
public class Teacher {
    private int id;
    private String name;
    private String sex;
    private int age;
    private double height;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<1|| name.length()>4){
            System.out.println("名字长度大于一位少于四位");
            return;
        }
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(!sex.equals("男")&&!sex.equals("女")){
            System.out.println("性别只能是男和女");
            return;
        }
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<20 || age>55){
            System.out.println("年龄只能在20-55之间");
            return;
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<1.5 || height>1.8){
            System.out.println("身高只能在1.50-1.80之间");
            return;
        }
        this.height = height;
    }

    public String showData(){
        return toString();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
