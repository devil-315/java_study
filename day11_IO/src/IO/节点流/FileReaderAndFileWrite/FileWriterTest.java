package IO.节点流.FileReaderAndFileWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName：FileWriterTest
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            //1.实例化File类
            File file = new File("hello02.txt");
            //2.创建具体的流，第二个参数为true，代表不会覆盖文件的内容，默认是false
            fileWriter = new FileWriter(file);
            //3.写入
            fileWriter.write("asdfghjkl");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
