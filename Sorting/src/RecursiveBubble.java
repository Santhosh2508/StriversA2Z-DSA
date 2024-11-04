import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
        int[] arr = { 13,46,24,52,20,9};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        recusive(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void recusive(int[] arr , int n){
        if(n == 1){
            return;
        }
        boolean didSwap = false;
        for(int j = 0 ; j < n-1; j++){
            if(arr[j] > arr[j+1]){
                swap(arr,j,j+1);
                didSwap = true;
            }
        }

        if(!didSwap)
            return;
        recusive(arr,n-1);
    }

    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
