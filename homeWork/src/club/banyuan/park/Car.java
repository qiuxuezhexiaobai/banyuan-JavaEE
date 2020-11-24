package club.banyuan.park;

/**
 * @author nijing
 * @date 2020/11/18 3:54 下午
 * @override 1.0
 */
public class Car {
    private String carId; //车牌号
    private String carBrand; //车品牌
    private int carSpace;//停车位

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarSpace() {
        return carSpace;
    }

    public void setCarSpace(int carSpace) {
        this.carSpace = carSpace;
    }

    @Override
    public String toString() {
        return "Car{" +
                "车牌号 ='" + carId + '\'' +
                ", 品牌='" + carBrand + '\'' +
                ", 停车位=" + carSpace +
                '}';
    }
}
