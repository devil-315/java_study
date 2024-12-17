package file;

import java.io.File;

/**
 * ClassName：Demo03
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        //相对路径
        File file = new File("hello.txt");

        //绝对路径
        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\hello.txt");

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        System.out.println("=============");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
    }
}
