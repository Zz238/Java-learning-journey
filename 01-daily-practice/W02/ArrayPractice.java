import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
            int nums[] = {1,1,2,2,2,3,3,3,3,3};
            int show[] = arr4(nums);
            System.out.println(Arrays.toString(show));
    }
//    查找数组最大值
    public static  int arr(int[] arr) {
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
//    打乱数组中的元素
    public static  int[] arr2(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int r =  random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
//    查找数组中的数据是否存在,如果存在打印索引，如果不存在，提示该数据不存在；
    public static  int arr3(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                System.out.println(i);
                return i;
            }

        }
            System.out.println("该数据不存在");
                    return -1;


    }
//    给定一个递增的有序数组，去除其中的重复元素
    public static  int[] arr4(int[] arr) {
        int slow = 0;
        int fast = 1;
       while (fast < arr.length) {
           if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
           }
           fast++;
       }
        return Arrays.copyOf(arr, slow + 1);
    }
}
