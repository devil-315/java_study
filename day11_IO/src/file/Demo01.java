package file;

import java.io.File;

/**
 * ClassName：Demo01
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //相对路径
        File file = new File("hello.txt");

        //绝对路径
        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\hello.txt");

        //只返回路径，不创建文件
        System.out.println(file);
        System.out.println(file1);

        File file2 = new File("C:\\Users\\Lenovo\\Desktop\\", "hello");
        System.out.println(file2);

        File file3 = new File(file2, "hello.txt");
        System.out.println(file3);
    }
}
