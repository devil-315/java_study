package IO.序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
//反序列化
public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("object.java");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        String str = (String) o;
        System.out.println(o);
        objectInputStream.close();
        fileInputStream.close();
    }
}
