package _06_时间类.日历类;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入日期：");
        String date = scanner.next();

        Calendar calendar = new GregorianCalendar();

        //1. String ==> calendar
        calendar.setTime(Date.valueOf(date));

        //2. 日历头部
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //计算当月的最大天数
        int maxDay = calendar.getActualMaximum(Calendar.DATE);

        //计数器
        int count = 0;

        //获取当前的日期
        int nowday = calendar.get(Calendar.DATE);
//        System.out.println("当前日期："+nowday);
        //获取当月的第一天是一周中的星期几
        //1.将日期变成当月的1号
        calendar.set(Calendar.DATE,1);
        //2. 获取1号对应的是一周中的第几天
        int dayofWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("一周的第几天："+dayofWeek);

        //计算1号前有多少个tab
        int tab = dayofWeek - 1;

        //遍历tab
        for(int i = 1;i <= tab ; i++){
            System.out.print("\t");
        }
        count += tab;
        //从1-最大天数
        for(int i = 1; i <= maxDay; i++){
            if(i == nowday){
                System.out.print(i + "*\t");
            }else{
                System.out.print(i + "\t");
            }
            count++;
            if(count % 7 == 0){
                System.out.println();
            }
        }
    }
}
