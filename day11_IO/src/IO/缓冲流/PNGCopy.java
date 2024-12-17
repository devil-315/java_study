package IO.缓冲流;

import java.io.*;

/**
 * ClassName：TextCopy
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class PNGCopy {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream =null;
        BufferedOutputStream bufferedOutputStream =null;

        try {
            //1.创建File对象
            File file1 = new File("aa.png");
            File file2 = new File("cc.png");

            //2.创建节点流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);

            //3.创建缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //4.数据的读入和写入
            byte[] bytes = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1){
                //将内容写入缓冲区
                bufferedOutputStream.write(bytes,0,len);
                //手动将内容写入文件
                bufferedOutputStream.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(bufferedOutputStream != null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
