package com.devil;

/**
 * ClassName：Test02
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //todo 获取一个类的字节码对象
        Class uclass = User.class;
        System.out.println(uclass);

        //如果已经知道某一个类的实例，调用这个实例的getClass()方法
        User user = new User();
        Class uclass2 = user.getClass();
        System.out.println(uclass2);

        Class aClass = Class.forName("com.devil.User");
        System.out.println(aClass);
    }
}
