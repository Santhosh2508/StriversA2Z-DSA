import java.util.Arrays;

public class Q6_RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2, 3 ,4,  5 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
//        brute(arr,arr.length,3);
        rotateLeft(arr, arr.length, 2);
        int[] arr1 = {1,2, 3 ,4,  5 };
        rotateRight(arr1,arr1.length,2);

    }

    static void  brute(int[] arr,int n, int d){
        for(int k = 0; k < d; k++){
            int temp = arr[0];
            for(int i = 1; i<n ; i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    static void rotateLeft(int[] arr, int n,int k){
        k = k % n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    //optimal approach for right rotate
    static void rotateRight(int[] arr, int n , int k){
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }
}
