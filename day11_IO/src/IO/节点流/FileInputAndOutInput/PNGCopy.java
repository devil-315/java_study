package IO.节点流.FileInputAndOutInput;

import java.io.*;

/**
 * ClassName：PNGCopy
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class PNGCopy {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            //1.创建File对象
            File file1 = new File("aa.png");
            File file2 = new File("bb.png");

            //2.创建流
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);

            //3.读取数据
            byte[] bytes = new byte[5];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
