package club.banyuan.park;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/18 4:04 下午
 * @override 1.0
 */
public class CarService {

    private int size = 20; // 设置车库可存放多少车辆

    private Car[] cars = null; //整个停车厂车位

    private Car[] spaceArr = new Car[0]; //已经停放车的车位

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public CarService(int size){
        this.size = size;
        cars = new Car[size];
    }

    /**
     * 添加入库车辆
     */
    public void addCar(Car car){
        for (int i = 0; i < spaceArr.length; i++) {
            if(car.getCarId().equals(spaceArr[i].getCarId())){
                System.out.println("该车辆已经停止车库中");
                return;
            }
        }
        boolean isNull = false;//没有停车位
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null){
                isNull = true;
            }
        }
        if(!isNull){
            System.out.println("没有停车位了");
            return;
        }
        int index = getSpace(); //车主选择的车位
        car.setCarSpace(index);
        cars[index] = car;
        spaceArr = Arrays.copyOf(spaceArr, spaceArr.length + 1);
        spaceArr[spaceArr.length - 1] = car;
    }
    /**
     *移除入库车辆
     * @param carId  车牌号
     */
    public  Car  removeCar(String carId){
        Car temp = null;
        for (int i = 0; i < spaceArr.length; i++) {
            if(spaceArr[i].getCarId().equals(carId)){
                cars[spaceArr[i].getCarSpace()] = null;
                temp = spaceArr[i];
                for (int j = i; j < spaceArr.length - 1; j++) {
                    spaceArr[j]=spaceArr[j+1];
                }
            }
        }
        spaceArr = Arrays.copyOf(spaceArr, spaceArr.length - 1);
        return temp;
    }
    /**
     * 查询所有的入库车辆信息
     */
    public  void  showInfoAll(){
        for (int i = 0; i < cars.length; i++) {
            String info = "空位";
            if(cars[i] != null){
                info="车牌:"+cars[i].getCarId()+"的"+cars[i].getCarBrand();
            }
            if((i+1)%6 == 0){
                System.out.print("第"+i+"号车位:" +info +"\t\n");
            }else{
                System.out.print("第"+i+"号车位:" + info+"\t");
            }
        }
    }
    /**
     * 根据品牌查询汽车信息
     */
    public  Car[] getByCarBrand(String brand){
        Car[] temp = new Car[spaceArr.length];
        int key =  0;
        for (int i = 0; i < spaceArr.length; i++) {
            if(spaceArr[i].getCarBrand().equals(brand)){
                temp[key++] = spaceArr[i];
            }
        }
        temp = Arrays.copyOf(temp, key);
        return temp;
    }
    /**
     * 车主选择的车位
     */
    private int getSpace(){
        int key = (int)(Math.random()*size );
        if(spaceArr == null || spaceArr.length == 0){
            return key;
        }
        boolean flag = true;
        while (flag){
            for (int i = 0; i < spaceArr.length; i++) {
                if(spaceArr[i].getCarId().equals(key)){
                    key = (int)(Math.random()*size);  // key 在 0 ~ size-1; 随机
                }else{
                    flag = false;
                    break;
                }
            }
        }
        return key;
    }
}
