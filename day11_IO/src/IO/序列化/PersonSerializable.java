package IO.序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ClassName：PersonSerializable
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class PersonSerializable {
    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;

        try {
            //创建字节流
            FileOutputStream fileOutputStream = new FileOutputStream("Person.java");
            //反序列化
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(new Person("devil",18));

            objectOutputStream.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
