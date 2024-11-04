import java.util.HashMap;
import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        n = scan.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int key = arr[i];
            int freq  = 0;
            if(mp.containsKey(key)) {
                freq = mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }

        int q;
        q = scan.nextInt();
        while(q-- > 0){
            int number;
            number = scan.nextInt();

            if(mp.containsKey(number))
                System.out.println(mp.get(number));
            else
                System.out.println(0);
        }

        //optimized by copilot
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for (int key : arr) {
//            mp.put(key, mp.getOrDefault(key, 0) + 1);
//        }
//
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int number = scan.nextInt();
//            System.out.println(mp.getOrDefault(number, 0));
//        }
    }
}
