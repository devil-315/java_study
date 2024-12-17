package 饿汉式;

/**
 * ClassName：Sington
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Sington {
    private final static  Sington INSTANCE =new Sington();
    private Sington(){

    }
    public static Sington getINSTANCE(){
        return INSTANCE;
    }
}
