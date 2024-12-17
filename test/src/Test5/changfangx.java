package Test5;

/**
 * ClassName：hcangfangx
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class changfangx implements Shape{
    private double len;
    private double wid;

    public changfangx() {
    }

    public changfangx(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getWid() {
        return wid;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    @Override
    public double area() {
        return wid*len;
    }

    @Override
    public double perimeter() {
        return 2*(wid+len);
    }
}
