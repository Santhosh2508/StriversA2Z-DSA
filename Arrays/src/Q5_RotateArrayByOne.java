import java.util.Arrays;

public class Q5_RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1,2 ,2 ,3 ,3, 3 ,4, 4 ,5, 5 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        //brute force follow note / strivers A2D notes
        //use secondary array and copy element
        //optimal approach tc = O(N) / sc = O(1)
        int temp = arr[0];
        for(int i = 1; i<n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
