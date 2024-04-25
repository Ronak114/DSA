import java.util.*;

//function with parameters.
public class a16_function {

    public static int printSum(int a, int b) {// parameters or formal paramters.
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        // jaha input lena hai waha scanner class chahiye.
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int sum1 = printSum(p, q);// arguments or actual parameters.
        System.out.println("sum :" + sum1);
        // both sum and sum1 are diff var as their scope diff.
    }
}
