public class forLost {
    public static void main(String[] args) {
//        有一组特殊的数字，每一项都是前两项的和的数字和，请问第10项数字是多少？

        int a = 0;
        int b = 1;
        int c = 0;
//        因为是前两项和的数字和所有从第三项开始
        for (int i = 3; i <=10 ; i++) {
                c = a+b;
                a = b;
                b = c;
        }
        System.out.println(c);
    }
}
