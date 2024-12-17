package _06_时间类.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        //字符串==》日期
        String dateStr = "2024-08-12 14:00:22";
        Date parse = simpleDateFormat.parse(dateStr);
        System.out.println(parse);
        System.out.println(simpleDateFormat.format(parse));
    }
}
