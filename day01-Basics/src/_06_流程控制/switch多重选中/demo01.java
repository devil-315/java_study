package _06_流程控制.switch多重选中;

/**
 * ClassName：demo01
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        int num =1 ;
        switch (num){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.printf("8");
        }
    }
}
