package com.devil03;

import java.lang.reflect.Constructor;
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
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取字节码信息
        Class u1 = Class.forName("com.devil03.User");

        //获取类中所有的公共方法,
        Method[] methods = u1.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        //获取类中所有的方法，包括private修饰的方法
        System.out.println("==========");
        Method[] declaredMethods = u1.getDeclaredMethods();
        for (Method method :
                declaredMethods) {
            System.out.println(method);
        }

        //获取类中的指定方法,不包括private
        System.out.println("============");
        Method getName = u1.getMethod("getName", null);
        System.out.println(getName);
        Method setName = u1.getMethod("setName", String.class);
        System.out.println(setName);

        //获取类中的指定方法,包括private
        System.out.println("===========");
        Method play = u1.getDeclaredMethod("play", null);
        System.out.println(play);
        Method play2 = u1.getDeclaredMethod("play2", String.class);
        System.out.println(play2);

        System.out.println("============");
        Constructor[] constructors = u1.getConstructors();
        for (Constructor c :
                constructors) {
            System.out.println(c);
        }

        System.out.println("=============");
        Constructor[] declaredConstructors = u1.getDeclaredConstructors();
        for (Constructor constructor :
                declaredConstructors) {
            System.out.println(constructor);
        }

        System.out.println("==========");
        Constructor declaredConstructor = u1.getDeclaredConstructor(String.class, int.class, int.class, String.class);
        System.out.println(declaredConstructor);
    }
}
