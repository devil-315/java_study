package IO.序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */

//序列划
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.java"));
        //制造对象
        objectOutputStream.writeObject(new String("你好"));
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
