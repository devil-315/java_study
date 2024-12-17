package com.devil;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取字节码对象
        Class<?> name = Class.forName("com.devil.User");
        System.out.println(name);
    }
}
