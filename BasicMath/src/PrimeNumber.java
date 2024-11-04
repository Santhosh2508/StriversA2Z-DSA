import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt =0;
        int n = scan.nextInt();

        for(int i = 1; i*i <=n ; i++){
            if(n%i==0){
                System.out.println(n + "%" + i + " " +(n%i));
                cnt++;
                if(n/i != i){
                    System.out.println(n + "/" + i + " " + (n/i));
                    cnt++;
                }
            }
        }
        if(cnt==2){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
