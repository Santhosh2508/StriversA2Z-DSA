import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        pattern21(n);


    }

    public static void pattern11(int n) {
        int start;

        for (int i = 0; i < n; i++) {

            start = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j < i + 1; j++) {
                System.out.print(start + " ");
                start ^= 1;
            }
            System.out.println();

        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            //spaces
            for (int k = 0; k < 2 * (2 * (n - i)); k++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            //newline
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {

        for (int i = 0; i < n; i++) {
//            for(int j = 0 ; j <= i; j++){
//                System.out.print((char) (65+j) + " ");
//            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
//            for(int j =0; j <=i; j++){
//                System.out.print((char)( 'A' + i) + " ");
//            }
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {

        //mine
//        for(int i=1; i<=n; i++){
//
//            //space
//            for(int k=0; k<n-i ; k++){
//                System.out.print(" ");
//            }
//            //charf
//            for(char ch='A'; ch<(char)('A' + (i-1)) ; ch++){
//                System.out.print(ch);
//            }
//            //charr
//            for(char ch=(char) ('A' + (i-1)); ch>='A'; ch--){
//                System.out.print(ch);
//            }
//            System.out.println();

        //strivers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';

            int breakpoint = (2 * i) / 2;
            for (int j = 0; j <= 2 * i; j++) {

                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else ch--;
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + n - i - 1);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();

        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {

            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //symmetry
        for (int i = 0; i < n; i++) {

            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

            int star, space;
            if (i > n) {
                star = 2 * n - i;
                space = 2 * (i - n);
            } else {
                star = i;
                space = 2 * (n - i);
            }

            //stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n) {
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i =0 || i=n-1) {
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}
