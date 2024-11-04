import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        ArrayList<Integer> result = primeNumbersTillN(N);

        System.out.print(result + " ");
    }

    public static ArrayList<Integer> primeNumbersTillN(int N) {
            boolean[] isPrime = new boolean[N + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;

            for (int num = 2; num * num <= N; num++) {
                if (isPrime[num]) {
                    for (int mul = num * num; mul <= N; mul += num) {
                        isPrime[mul] = false;
                    }
                }
            }

            ArrayList<Integer> primes = new ArrayList<>();
            for (int i = 2; i <= N; i++) {
                if (isPrime[i]) {
                    primes.add(i);
                }
            }
            return primes;
        }
    }

