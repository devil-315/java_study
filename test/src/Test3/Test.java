package Test3;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        GeometricObject r1 = new MyRectangle("blue", 10.0, 4.0, 3.0);
        GeometricObject c1 = new Cirle("red", 10.0, 2.0);
        Cirle c2 = new Cirle("red",10.0,2.0);
        MyRectangle r2 = new MyRectangle("blue", 10.0, 4.0, 3.0);
        Test test = new Test();
        test.equalsArea(r1,r2);
        test.display(r1);
        test.display(r2);
        test.equalsArea(c1,c2);
        test.display(c1);
        test.display(c2);

    }
    public void equalsArea(GeometricObject x,MyRectangle y){
        if(x.findArea() == y.findArea()){
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }
    }
    public void equalsArea(GeometricObject x,Cirle y){
        if(x.findArea() == y.findArea()){
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }
    }

    public void display(GeometricObject x){
        System.out.println(x.findArea());
    }

}
