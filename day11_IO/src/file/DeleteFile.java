package file;

import java.io.File;

/**
 * ClassName：DeleteFile
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
//删除文件夹（删除文件夹下的所有文件，如果遇到文件夹，把文件夹中的文件也删除）
public class DeleteFile {
    /*
    * 1.如果是文件，直接删除
    * 2.如果是文件夹，不能直接删除，进入文件夹目录
    *       判断有没有文件
    *               如果没有文件，文件夹删除
    *               如果有文件，将所有文件删除，才能删除文件夹
    * */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\target");
        deleteFile(file);
    }

    public static void deleteFile(File file){
        //文件
        if(file.isFile()){
            System.out.println("删除文件：" + file);
            if(file.delete()){
                System.out.println(file.getAbsoluteFile() + "删除成功");
            }
        }else {
            //文件夹
            System.out.println("这是一个文件夹");
            File[] files = file.listFiles();
            //删除
            for (File f : files) {
                deleteFile(f);
            }
            System.out.println("删除文件夹:" + file.getAbsoluteFile() );
            //文件夹
            file.delete();
        }
    }
}
