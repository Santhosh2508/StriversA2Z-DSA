import java.util.Arrays;
import java.util.HashSet;

public class Q4_RemoveDuplicate {
    //Remove Duplicate from Sorted Array in Place
    public static void main(String[] args) {
        int[] arr = {1,2 ,2 ,3 ,3, 3 ,4, 4 ,5, 5 };
        int n = arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr));
        int unique = optimal(arr,n);
        System.out.println("Unique : " + unique);
    }

    //tc = O(NlogN + N) sc = O(N)
    static int brute(int[] arr,int n){
        HashSet<Integer> list = new HashSet<>();

        for(int i = 0; i< n; i++){
            list.add(arr[i]);
        }

        int index = 0;

        for(Integer ele : list){
            {
                arr[index++] = ele;
            }
        }
        return index;
    }

    static int optimal(int[] arr,int n){
        //two pointer

        int i = 0;
        for(int j = 1; j < n ; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
