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
public class TextCopy {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            //1.创建File对象
            File file1 = new File("hello.txt");
            File file2 = new File("helloCopy2.txt");

            //2.创建节点流
            FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter = new FileWriter(file2);

            //3.创建缓冲流
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            //4.数据的读取和写入
            char[] chars = new char[1024];
            int len;
            while ((len = bufferedReader.read(chars)) != -1){
                //5.将内容写入缓冲区
                bufferedWriter.write(chars,0,len);
                //6.手动将内容写入文件
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //7.关闭流
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
