package _04_字符和字符串;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        String str = "一碗隆江猪脚饭，吃出男人的浪漫";
        System.out.println(str);

        String str02 = "一碗隆江猪脚饭，\"吃出男人的浪漫";
        System.out.println(str02);

        String str03 = "一碗隆江猪脚饭，\\吃出男人的浪漫";
        System.out.println(str03);

        String str04 = "一碗隆江猪脚饭，\n\r吃出男人的浪漫";
        System.out.println(str04);

        String str05 = "一碗隆江猪脚饭，\t吃出男人的浪漫";
        System.out.println(str05);
    }
}
