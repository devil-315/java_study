package file;

import java.io.File;
import java.io.IOException;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        //相对路径
        File file = new File("hello.txt");

        //绝对路径
        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\hello.txt");

        if(file.exists()){
            System.out.println("删除成功");
            file.delete();
        }else{
            file.createNewFile();
        }

        if(file1.exists()){
            System.out.println("删除成功");
            file1.delete();
        }else{
            file1.createNewFile();
        }
    }
}
