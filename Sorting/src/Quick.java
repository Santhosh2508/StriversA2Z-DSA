import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low , int high){
        if(low>= high ){
            return ;
        }
        int pIndex = partition(arr, low , high);
        quickSort(arr,low,pIndex-1);
        quickSort(arr,pIndex+1,high);
    }

    static int partition(int[] arr,int low,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i < j){
            while(arr[i]<=pivot && i <= high-1){
                i++;
            }
            while (arr[j]>pivot && j >= low+1){
                j--;
            }
            if(i<j) {
                swap(arr, i, j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
