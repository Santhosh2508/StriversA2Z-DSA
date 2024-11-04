
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean result = palindrome_chcek( n);
        System.out.println(result);
    }
    public static boolean palindrome_chcek(int x){


                int n = x;
                int rev = 0;
                int digit;
                while ( n > 0){
                    digit  = n %10;
                    rev = rev*10 + digit;
                    n = n/10;
                }
        System.out.println(rev);
        return rev == x;
            }


}

