public class BmiCalculator {
    public static void main(String[] args) {
        //    BMI计算公式 体重 / 身高的平方
        double weight = 58.3;
//    记录我的身高；
        double height = 1.78;
        double bmi = weight / (height * height);
        System.out.println(bmi);
    }


}
