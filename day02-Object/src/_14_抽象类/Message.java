package _14_抽象类;

/**
 * ClassName：Message
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */

//TODO 使用abstract 关键字 定义 抽象类
abstract class Message {
    private String type;

    // TODO abstract 关键字定义抽象方法
    public abstract String getConnect();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void  print(){
        System.out.println("普通方法");
    }
    public static  void  show(){
        System.out.println("静态方法");
    }
}
