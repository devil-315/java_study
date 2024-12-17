package Test6;

/**
 * ClassName：Truck
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(String brand, String model, int year, double rentalFee, double maxLoad) {
        super(brand, model, year, rentalFee);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
}
