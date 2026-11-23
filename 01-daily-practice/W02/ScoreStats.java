public class ScoreStats {
    public static void main(String[] args) {
        int scores[] = {60,70,80,90,100};
        int max = FindMax(scores);
        int min = FindMin(scores);
        int avg = FindAverage(scores);
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);



    }
    public static  int FindMax(int[] scores) {
        int max = scores[0];
        for(int score : scores){
            if(score > max){
                max = score;
            }
        }
        return max;
    }
    public static  int FindMin(int[] scores) {
        int min = scores[0];
        for(int score : scores){
            if(score < min){
                min = score;
            }
        }
        return min;
    }
//    求平均数
    public static  int FindAverage(int[] scores) {
        int average = 0;
        for(int score : scores){
            average += score;
        }
        return average / scores.length;
    }

}
