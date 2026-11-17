import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double wight = sc.nextDouble();
        double height = sc.nextDouble();
       double bmi = wight / (height * height);
       System.out.printf("%.1f\n",bmi);
    }
}
