package Test3;

/**
 * ClassName：Cirle
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Cirle extends GeometricObject{
    private double radius;

    public Cirle() {
    }

    public Cirle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14*radius*radius;
    }
}
