import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int []scores = new int[5];

            for (int i = 0; i < scores.length; i++) {
                int score = sc.nextInt();
                if(score >= 0 && score <= 100) {
                    scores[i] = score;
                }else{
                    System.out.println("分数超出范围");
                    i--;
                }
            }
            int max = getMax(scores);
            int min = getMin(scores);
            int sum = 0;
            for(int score : scores){
                    sum += score;
            }
            double avg = (sum -max -  min) / 3;

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("总分：" + sum);
        System.out.println("选手最终得分：" + avg);
    }
    public static  int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static  int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
