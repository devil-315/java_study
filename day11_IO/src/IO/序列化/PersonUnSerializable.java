package IO.序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ClassName：PersonUnSerializable
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class PersonUnSerializable {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        try {
            //创建字节流
            FileInputStream fileInputStream = new FileInputStream("Person.java");

            //序列化
            objectInputStream = new ObjectInputStream(fileInputStream);

            Object o = objectInputStream.readObject();

            Person person =(Person) o;
            System.out.println(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
