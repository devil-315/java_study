package IO.转换流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName：Demo01
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
        //字节 ==》字符
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1){
            String s = new String(chars, 0, len);
            System.out.print(s);
        }
        fileInputStream.close();
    }
}
