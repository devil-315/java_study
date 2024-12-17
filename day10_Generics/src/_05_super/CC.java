package _05_super;

/**
 * ClassName：CC
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class CC extends BB {
    String name;


    public CC(String name) {
        this.name = name;
    }

    public CC(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CC{" +
                "name='" + name + '\'' +
                '}';
    }
}
