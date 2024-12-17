package _06_时间类.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
        //获取当前的日期
        LocalDate localDate = LocalDate.now();
        //获取当前的时间
        LocalTime localTime = LocalTime.now();
        //获取当前的日期+时间
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //设置年月日时分秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 8, 12, 13, 12, 34);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //体现不可变性
        //withxxx:设置属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);
    }
}
