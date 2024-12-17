package Test6;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Car car = new Car("benchi", "E300L", 2024, 100, 4);
        Truck truck = new Truck("dazong", "S680", 2024, 100, 80);
        RentalAgency rentalAgency = new RentalAgency();

        double cars = rentalAgency.rent(car,5);
        double trucks = rentalAgency.rent(truck,6);

        System.out.println("cars:"+cars);
        System.out.println("trucks:"+trucks);
    }
}
