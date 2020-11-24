package club.banyuan.abstractDemo.demo3;

/**
 * @author nijing
 * @date 2020/11/24 6:48 下午
 * @override 1.0
 */
public class Person implements Vehicle{
    private String name;

    private String vehcileType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String buy(){
        return "买票";
    }

    public String newYear(){
        return "回家过年";
    }

    @Override
    public void choseVehicle(String str) {
        this.vehcileType = str;
    }

    @Override
    public String toString() {
        return  name + buy() + vehcileType+newYear();
    }
}
