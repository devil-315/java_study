package Test10;

import java.util.Random;

/**
 * ClassName：Util
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class Util {
    public static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String generateRandomPassword(int length){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(index));
        }
        return stringBuilder.toString();
    }
}
