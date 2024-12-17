package Test6;

/**
 * ClassName：Car
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String brand, String model, int year, double rentalFee, int numberOfSeats) {
        super(brand, model, year, rentalFee);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
