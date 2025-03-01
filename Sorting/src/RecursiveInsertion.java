import java.util.Arrays;
public class RecursiveInsertion {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        insertion_sort(arr,0,n);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion_sort(int[] arr, int i,int n){
        if(i == n)
            return;
        int j = i;
        while(j > 0  && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr,i+1,n);
    }
}
