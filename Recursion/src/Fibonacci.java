import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        System.out.println();
        int ans = fibonacci(n);
        System.out.println(ans);
        fibonacci(n);
    }

    //recursion
    static int fibonacci(int n){
        if(n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n -2);
    }

     static void fibonacci1(int n){
        int first = 0 ;
        int second = 1;
        int sum = first + second;
        if(n<=1){
            System.out.print(0);
            if(n==1)
                System.out.print(" " + n);

            return;
        }
         System.out.print(0 + " "+ 1 + " ");
        for(int i = 2; i<=n; i++){
            System.out.print(sum+ " ");
            first = second ;
            second = sum ;
            sum = first + second;
        }
    }

}
