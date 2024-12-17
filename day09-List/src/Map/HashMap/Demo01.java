package Map.HashMap;

import java.util.HashMap;

/**
 * ClassName：Demo01
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        //添加
        hashMap.put("AA",123);
        hashMap.put("bb",123);
        hashMap.put(45,1234);
        System.out.println(hashMap);
        //修改
        hashMap.put("AA",789);
        System.out.println(hashMap);

        HashMap hashMap02 = new HashMap();
        hashMap02.put("C",123);
        hashMap02.put("D",145);

        System.out.println(hashMap02);
        hashMap.putAll(hashMap02);
        System.out.println(hashMap);

        //删除
        hashMap.remove("C");
        System.out.println(hashMap);

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        hashMap.clear();
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
    }
}
