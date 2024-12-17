package _06_时间类.日期处理;

import java.util.Date;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getTime());

        long l = System.currentTimeMillis();
        System.out.println(l);

        Date date2 = new Date(1723428036190L);
        System.out.println(date2);

        //TODO java.sql.date
        java.sql.Date date1 = new java.sql.Date(1723428036190L);
        System.out.println(date1);

        /*
        TODO java.sqlDate 和 java.util.Date 的区别和联系
         util.Date 可以表示 年月日时分秒
         sql.Date 只能表示 年月日
          java.sql.Date(子) 和 java.util.Date(父) 是父子类的关系
         */

        // TODO java.util.Date ==> java.sql.Date
        long time = new Date().getTime();
        java.sql.Date date3 = new java.sql.Date(time);
        System.out.println(date3);

        // TODO java.sql.Date ==> java.util.Date

        Date date4 = date3;
        System.out.println(date4);
    }
}
