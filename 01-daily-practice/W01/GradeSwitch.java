import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
                case 2:
                    System.out.println("游泳");
            default:
                System.out.println("吃饭");
        }
    }
}
