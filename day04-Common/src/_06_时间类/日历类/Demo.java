package _06_时间类.日历类;

import java.util.Calendar;
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
        //Calendar 是抽象类 不能创建对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //TODO 常用方法
        System.out.println(calendar.get(1));
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONDAY);
        System.out.println(Calendar.DATE);

        //一周的第几天
        System.out.println(Calendar.DAY_OF_WEEK);

        //本月最大是几号
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        System.out.println(calendar.getActualMinimum(Calendar.DATE));

        //将calendar 变为指定日期
        calendar.set(Calendar.YEAR,2023);
        calendar.set(Calendar.MONTH,6);
        calendar.set(Calendar.DATE,12);
        System.out.println(calendar);

        //TODO String ==> calendar

        //1.String ==> date
        Date date = java.sql.Date.valueOf("2023-12-7");
        // Data ==> Calendar
        calendar.setTime(date);

        System.out.println(calendar);
    }
}
