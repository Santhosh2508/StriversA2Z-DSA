import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i =0; i<n-2; i++){
            int min = i;
            for(int j = i+1 ; j< n ; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
