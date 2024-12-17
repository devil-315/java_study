package Test6;

/**
 * ClassName：Vehicle
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double rentalFee;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year, double rentalFee) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalFee = rentalFee;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }
}
