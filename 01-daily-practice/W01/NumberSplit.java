import java.util.Scanner;

public class NumberSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int  ge = N % 10;
        int shi = N / 10 % 10;
        int bai = N / 100 %10;
        System.out.println(shi);

    }
}
