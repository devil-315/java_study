package Collection;

import java.util.ArrayList;
import java.util.Collection;


/**
 * ClassName：Demo01
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();

        arrayList.add("devil");
        arrayList.add("hello");
        arrayList.add("123");
        System.out.println(arrayList.size());

        Collection arrayList02 = new ArrayList();
        arrayList02.add("cc");
        arrayList02.add("bb");
        arrayList02.add(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList02.size());

        //清空
        arrayList02.clear();
        System.out.println(arrayList02.isEmpty());
    }
}
