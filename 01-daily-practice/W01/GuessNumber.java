import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
//            生成一个0-100之间的随机数，利用键盘模拟猜的动作，一直猜，直到猜中为止

        Random rand = new Random();
        int r = rand.nextInt(1,100);
        System.out.println(r);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();
            if(guessNumber > r) {
                System.out.println("你猜的太大了");
            } else if (guessNumber < r) {
                System.out.println("你猜的太小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }

}
