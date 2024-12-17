package IO.节点流.FileReaderAndFileWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName：FileReaderTest
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //1.实例化file对象
            File file = new File("hello.txt");
            //2.提供一个具体的流
            fileReader = new FileReader(file);
            //3.数据的读入
            int data;
            while ((data = fileReader.read()) != -1){
                System.out.println((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileReader != null){
                try {
                    //关闭流
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
