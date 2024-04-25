import java.util.*;

public class a11M_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print reverse of a no.
        int n = 14092003;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }

    // reverse the given no. (change the original no.)
        // int n = 10899;
        // int rev = 0;
        // while (n > 0) {
        // int lastDigit = n % 10;
        // rev = ((rev * 10) + lastDigit);
        // n = n / 10;
        // }
        // System.out.println(rev);
    }
}
