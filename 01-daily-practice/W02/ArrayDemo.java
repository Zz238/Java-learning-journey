public class ArrayDemo {
    public static void main(String[] args) {

        int arr[] = {11,22,3,66,888};
        int max = arr[0]; // 先定义一个最大的值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
