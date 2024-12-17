package Test12;

/**
 * ClassName：Coordinate
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class Coordinate<T> {
    private T x;
    private T y;

    public Coordinate() {
    }

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
