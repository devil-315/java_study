package com.devil04;

import com.devil04.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取字节码对象
        Class c1 = Class.forName("com.devil04.User");

        //创建对象,本质上调用的是无参构造器
        User user =(User) c1.newInstance();
        System.out.println(user);
        System.out.println("============");

        //通过有参构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class, String.class);
        User user2 = (User) declaredConstructor.newInstance("devil", 18, 18, "123");
        System.out.println(user2);

        //调用普通方法
        //1.获取私有方法
        Method setName = c1.getDeclaredMethod("setName", String.class);

        //2.执行这个方法
        //(对象，值)
        setName.invoke(user,"devil");
        System.out.println(user.getName());

        System.out.println("==============");
        //操作公共属性属性
        User user4 = (User) c1.newInstance();
        Field id = c1.getDeclaredField("id");
        id.set(user4,123);
        System.out.println(user4.getId());

        System.out.println("=========");
        //操作私有属性属性
        Field age = c1.getDeclaredField("age");
        age.setAccessible(true);//关闭安全检测
        age.set(user4,456);
        System.out.println(user4.getAge());
    }
}
