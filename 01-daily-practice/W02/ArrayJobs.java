public class ArrayJobs {
    public static void main(String[] args) {
//        1.两数之和
            int nums[] = {1,2,3,4,5,6,7,8,9};
            int target = 3;
            int count = 0;
            for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    count++;
                    System.out.println( i+ "," +j);
                }
            }
        }
            System.out.println(count);
    }
    }
