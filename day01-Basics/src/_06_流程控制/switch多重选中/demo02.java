package _06_流程控制.switch多重选中;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        int score = 70;
        switch (score / 10){
            case 0,1,2,3,4,5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.printf("及格");
                break;
            default:
                System.out.println("成绩有误");
        }

        //优化
        switch (score / 60)
        {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩有误");
        }
    }
}
