package test;

/**
 * ClassName：Pizza
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Pizza {
    private String name;
    private double prize;
    private double size;

    public Pizza() {
    }

    public Pizza(String  name, double prize, double size) {
        this.name = name;
        this.prize = prize;
        this.size = size;
    }

    public String  getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public void show(){
        System.out.println("披萨");
    }
}
