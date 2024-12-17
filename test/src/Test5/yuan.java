package Test5;

/**
 * ClassName：yuan
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class yuan implements Shape{
    private double rad;

    public yuan() {
    }

    public yuan(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public double area() {
        return 3.14*rad*rad;
    }

    @Override
    public double perimeter() {
        return 2*3.14*rad;
    }
}
