package _06_自定义异常;

/**
 * ClassName：Food
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class Food {
    public static void eat(int num)throws MyException{
        if(num > 10){
            throw new MyException("吃太多了");
        }else {
            System.out.println("无所谓");
        }
    }
}
