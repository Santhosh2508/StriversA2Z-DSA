import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int result = gcd(a,b);
        System.out.println(result);
    }

    public static int gcd(int a, int b){

        int gcd = 1;
        int min = Math.min(a, b);

        //brute force
//        for(int i = 1; i<=min; i++){
//
//            if (a%i == 0 && b%i == 0){
//                gcd = i;
//            }
//        }

        //better approch
//        for(int i = min; i>0; i--){
//
//            if (a%i == 0 && b%i == 0){
//                return i;
//            }
//        }
//        return 1;

        //optimal approach
        while (a>0 && b>0){

            if(a>b){
                a = a%b;
            }
            else {
                b = b%a;
            }
        }

        if (a ==0) {
            return b;

        }
        return 1;
    }

}
