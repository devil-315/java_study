package Test10;

/**
 * ClassName：PasswordCrack
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class PasswordCrack {
    private static final int LENGTH = 3;
    private static final String PASSWORD = Util.generateRandomPassword(3);
    private static boolean passwordCrack = false;

    public static void main(String[] args) {
        System.out.println("密码：" + PASSWORD);
        Thread crackThread = new Thread(() -> {
            for (int i = 0; i < Util.CHARACTERS.length(); i++) {
                for (int j = 0; j < Util.CHARACTERS.length(); j++) {
                    for (int k = 0; k < Util.CHARACTERS.length(); k++) {
                        String password = "" + Util.CHARACTERS.charAt(i)+Util.CHARACTERS.charAt(j)+Util.CHARACTERS.charAt(k);
                        if(password.equals(PASSWORD)){
                            System.out.println("Crack ：" + password);
                            passwordCrack = true;
                            return;
                        }
                    }
                }
            }
        });

        Thread loggerThread = new Thread(() -> {
            while (true){
                if(!passwordCrack){
                    for (int i = 0; i < Util.CHARACTERS.length(); i++) {
                        for (int j = 0; j < Util.CHARACTERS.length(); j++) {
                            for (int k = 0; k < Util.CHARACTERS.length(); k++) {
                                String password = "" + Util.CHARACTERS.charAt(i)+Util.CHARACTERS.charAt(j)+Util.CHARACTERS.charAt(k);
                                System.out.println("可能的密码：" + password);
                            }
                        }
                    }
                }else {
                    return;
                }
            }
        });
        loggerThread.setDaemon(true);
        crackThread.start();
        loggerThread.start();
    }
}
