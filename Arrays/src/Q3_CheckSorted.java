import java.util.Arrays;

public class Q3_CheckSorted {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        boolean checkSort = leetcode(arr,arr.length);
        if(checkSort){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }

    static boolean normal(int[] arr, int n){
        for(int i = 1; i<n; i++){
            if(arr[i]>=arr[i-1]){
                //you can optimize the if statement
            }
            else {
                return false;
            }
        }
        return true;
    }

    //leetcode 1752\
    static boolean leetcode(int[] nums, int n){
        int count = 0;
        for(int i = 0; i< n; i++){
            if(nums[i]> nums[(i + 1 ) % n]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
//tc = O(N)