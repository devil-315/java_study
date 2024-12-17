package file;

import java.io.File;

/**
 * ClassName：Demo06
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Demo06 {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

        System.out.println("=============");
        File file1 = new File("C:\\Users\\Lenovo\\Desktop");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
}
