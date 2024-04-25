import java.util.*;

public class a12M_primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check a no, is prime or not.

        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("prime");
        } else {
            boolean isPrime = true;
            /******** update in loop********** */
            // for(int i=2;i<=Math.sqrt(n);i++)
            // 2 to squareroot of n.
            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
                // else{
                // isPrime=true;
                // }
                /*********** ye part se woh hamesha true he honga************ */
            }
            if (isPrime == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
