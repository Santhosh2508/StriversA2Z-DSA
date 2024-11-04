import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 13,46,24,52,20,9};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i< n-1; i++){
            boolean isSwap = false;
            for(int j = 0; j <n-i-1; j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            System.out.println(i+1 + " : " + Arrays.toString(arr));
            if(!isSwap){
               break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
