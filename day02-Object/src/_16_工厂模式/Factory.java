package _16_工厂模式;

/**
 * ClassName：Factory
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Factory {
    public static Food getInstance(String foodName){
        if("面包".equals(foodName)){
            return  new Bread();
        }else if ("牛奶".equals(foodName)){
            return  new Milk();
        }else {
            return null;
        }
    }
}
