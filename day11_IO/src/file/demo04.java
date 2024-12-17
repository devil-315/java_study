package file;

import java.io.File;

/**
 * ClassName：demo04
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class demo04 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lenovo\\Desktop");
        for (String s : file.list()) {
            System.out.println(s);
        }

        System.out.println("===============");
        File[] files = file.listFiles();
        for (File s :
                files) {
            System.out.println(s);
        }
    }
}
