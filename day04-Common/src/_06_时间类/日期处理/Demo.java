package _06_时间类.日期处理;

import java.util.Date;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        //获取毫秒数
        long time = date.getTime();
        System.out.println(time);

        //时间戳 ==> 日期
        System.out.println(new Date(time));
    }
}
