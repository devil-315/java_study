package file;

import java.io.File;

/**
 * ClassName：Demo05
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Demo05 {
    public static void main(String[] args) {
        //相对路径
        File file = new File("hello.txt");

        //绝对路径
        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\3.txt");

        //剪切   路径不同时，改名并且移动位置
        boolean b = file.renameTo(file1);
        System.out.println(b);

        //路径相同时，原地改名
        File file2 = new File("hello.txt");
        File file3 = new File("mjdn2.txt");
        System.out.println(file3.renameTo(file2));

    }
}
