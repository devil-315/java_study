package file;

import java.io.File;

/**
 * ClassName：Demo07
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Demo07 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\h1\\h2\\h3");
        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\h1");

        //如果路径存在，创建成功， 路径不存在，创建失败
        boolean b = file.mkdir();
        if(b){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }

        boolean b1 = file.mkdirs();
        if(b1){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }

        boolean b2 = file1.delete();
        if(b2){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
