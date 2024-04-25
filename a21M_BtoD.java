public class a21M_BtoD {
    /**********Binary to decimal************ */
    public static void B2D(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        int LD;// last digit.
        while (binNum > 0) {
            LD = binNum % 10;
            decNum = decNum + (LD * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + ": " + decNum);
    }

    /***************Decimal to Binary************ */
    public static void D2B(int n) {
        int myNum=n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
         System.out.println("binary of " + myNum + ": " + binNum);
    }

    public static void main(String[] args) {
        // Binary to decimal.
        B2D(101);

        // Decimal to binary.
        D2B(5);
    }
}
