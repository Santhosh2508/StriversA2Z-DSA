import java.util.Arrays;

//Q.Largest element in an array.
public class Q1_Largest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(Arrays.toString(arr));
        better(arr,arr.length);
    }
    //tc = O(N)
    static void better(int[] arr, int n){
        int largest = arr[0];
        for (int j : arr) {
            if (j > largest)
                largest = j;
        }
        System.out.println("Largest :" + largest);
    }
    //tc = O(NlogN)
    static void brute(int[] arr,int n){
        Arrays.sort(arr);
        int largest = arr[n-1];
        System.out.println("Largest :" + largest);
    }

}
