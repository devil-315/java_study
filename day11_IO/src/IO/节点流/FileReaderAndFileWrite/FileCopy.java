package IO.节点流.FileReaderAndFileWrite;

import java.io.*;

/**
 * ClassName：FileCopy
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        //1.创建file对象
        File file1 = new File("hello.txt");//要复制的文件，真实存在
        File file2 = new File("hellocopy.txt");//复制出来的文件，不存在
        try {
            //2.创建流
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2);

            //3.数据的读取
            char[] cubf = new char[5];
            int len;
            while ((len = fileReader.read(cubf)) != -1){
                //写入
                fileWriter.write(cubf,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
