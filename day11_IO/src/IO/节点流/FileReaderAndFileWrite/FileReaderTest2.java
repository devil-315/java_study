package IO.节点流.FileReaderAndFileWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName：FileReaderTest2
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class FileReaderTest2 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //1.实例化File对象
            File file = new File("hello.txt");

            //2.提供一个具体的流
            fileReader = new FileReader(file);

            //3.数据的读入
            char[] cubf = new char[5];
            int len;//读取的字符长度
            while ((len = fileReader.read(cubf)) != -1){
                //TODO 方式一
//                for (int i = 0; i < len; i++) {
//                    System.out.println(cubf[i]);
//                }

                //TODO 方式二
                String s = new String(cubf, 0, len);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

