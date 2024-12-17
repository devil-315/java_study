package IO.转换流;

import java.io.*;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
//文件的读取和写入
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("hello.txt");
        File file2 = new File("hello3.txt");

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        //读取 hello.txt的内容，并且写出到hello3.txt,格式为gbk
        //字节输入 ==》字符输入
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");

        //字符输出 ==》 字节输出
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        char[] chars = new char[20];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1){
            outputStreamWriter.write(chars,0,len);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
     /*   File file1 = new File("hello.txt");
        File file2 = new File("hello4.txt");

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        //读取hello.txt文件，写出到hello4.txt,并且格式为 GBK
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");


        char[] cbuf = new char[20];
        int len;
        while ((len = inputStreamReader.read(cbuf)) != -1) {
            outputStreamWriter.write(cbuf, 0, len);
        }


        //关闭资源
        inputStreamReader.close();
        outputStreamWriter.close();*/


    }
}
