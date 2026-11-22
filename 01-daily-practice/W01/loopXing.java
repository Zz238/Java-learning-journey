public class loopXing {
    public static void main(String[] args) {
//            循环打印正三角和倒三角形
        for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " *  "+ j +" = " + i * j + "\t");
                }
            System.out.println();
        }


    }
}
