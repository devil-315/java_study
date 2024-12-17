package test;

/**
 * ClassName：test02
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class test02 {
    public static void main(String[] args) {
        new A(new B());
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}


