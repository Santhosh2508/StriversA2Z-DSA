import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sumOfDivisors(n));
    }

    public static long sumOfDivisors(int N){
        // code here
        long sum = 0;
        for(int i =1 ; i*i <=N; i++){

            if(N%i ==0 )
            {
                sum+=i;
                if(i!= N/i)
                    sum+= N/i;
            }
        }
        return sum;
    }
}
