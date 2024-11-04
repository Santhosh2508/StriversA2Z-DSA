import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = { 2,4,78,9, 8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        reverseArray(0 , n-1 , arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void reverseArray1(int i , int n , Integer[] arr){
        if(i >= n/2){
            return;
        }
        swap(arr,i , n-i-1);
        reverseArray1(i + 1,n,arr);
    }
    static  void swap(Integer[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverseArray2(int start , int end , Integer[] arr){
        int temp;
        if(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray2(start + 1, end - 1, arr);
        }
        else
            return ;
    }

    static void reverseArray(int a , int b, Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
    }
}
