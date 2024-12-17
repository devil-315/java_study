package IO.节点流.FileInputAndOutInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //1.创建File对象
            File file = new File("hello.txt");
            //2.创建流
            fileInputStream = new FileInputStream(file);
            //3.读取数据
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1){
                String s = new String(buffer, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.关闭流
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
