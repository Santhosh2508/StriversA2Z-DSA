import java.util.Arrays;

public class Q2_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(Arrays.toString(arr));
        optimal(arr,arr.length);
    }

    //tc = O(NlogN + N)
    static void brute (int[] arr,int n){
        Arrays.sort(arr);
        int largest = arr[n-1];
        int sLargest = 0;
        for(int i = n-2; i>=0; i--){ //in case of duplicate element
            if(largest != arr[i]){
                sLargest = arr[i];
                break;
            }
        }
        System.out.println("Largest : " + largest + " and Second Largest : " +sLargest);
    }

    //tc = O(2N)
    static void better(int[] arr,int n){
        int largest = arr[0];
        int sLargest = -1; //positive numbers array else INT.MIN

        for(int i =1; i < n ; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        for(int i = 0; i< n ; i++){
            if(arr[i] != largest && arr[i] >sLargest){
                sLargest = arr[i];
            }
        }
        System.out.println("Largest : " + largest + " and Second Largest : " +sLargest);

    }


    //tc = O(N);
    static void optimal(int arr[] ,int n){

        //Largest and SecondLargest
        int largest = arr[0], sLargest = -1; // if positive else sLargest = int.min

        for(int i = 1; i< n; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i]>sLargest) {
                sLargest = arr[i];
            }
        }
        System.out.println("Largest : " + largest + " and Second Largest : " +sLargest);


        //Smallest and Second Smallest
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE  ; //if positive else INT.MAX

        for(int i = 1; i< n ;i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < sSmallest){
                sSmallest = arr[i];
            }
        }
        System.out.println("Smallest : " + smallest + " and Second Smallest : " +sSmallest);
    }
}
