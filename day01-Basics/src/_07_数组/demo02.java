package _07_数组;

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
        //TODO 方式一
        //创建一个长度为5的 int 类型的数组
        int[] scores =new int[5];
        scores[0] = 18;
        scores[1] = 28;
        scores[2] = 38;
        scores[3]=48;
        scores[4] = 58;

        //修改元素
        scores[4] = 99;
        System.out.println(scores[4]);

        //数组的长度
        System.out.println(scores.length);

        //TODO 方式二
        int[] arr = new int[] {1,2,3,4,5};
        int[] arr02 = {1,2,3,4,5};

        //TODO 先声明，再初始化要用new，否则会报错
//        int arr03[];
        int[] arr03;
        arr03 = new int[]{1,2,3,4,5};
    }
}
