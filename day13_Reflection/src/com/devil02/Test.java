package com.devil02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //获取字节码信息
        Class aClass = Class.forName("com.devil02.User");

        //类的全限定名
        System.out.println(aClass.getName());
        System.out.println("==============");

        //简称(类名)
        System.out.println(aClass.getSimpleName());
        System.out.println("=============");

        //获取User类中指定的public属性
        Field id = aClass.getField("id");
        System.out.println(id);
        //属性的类型
        System.out.println("属性的类型："+id.getType());

        //获取User类中所有的public属性
        Field[] fields = aClass.getFields();
        System.out.println("================");
        for (Field field :fields) {
            System.out.println(field);
        }

        System.out.println("================");
        //获取User类中的所有的属性，包括私有权限修饰符
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field :
                declaredFields) {
            System.out.println(field);
        }

        System.out.println("获取属性的修饰符");
        Field name = aClass.getDeclaredField("name");
        //获取属性的修饰符的代号
        int modifiers = name.getModifiers();
        //将代号转成字符串
        String s = Modifier.toString(modifiers);
        System.out.println(s);
    }
}
