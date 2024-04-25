public class a20_practice {
    /*************** print prime no. *******************/

    // only for n>=2
    public static boolean isPrime(int n) {
        // corner cases i.e 2
        if (n == 2) {
            return true;
        }

        // boolean isPrime=true;
        for (int i = 2; i < (n - 1); i++) {
            if (n % i == 0) {
                // isPrime=false;
                // break;
                return false;
            }
        }
        // return isPrime;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }

    /********* optimized way. **************/

    // loop will run from 2 to underroot of n.
    // for(int i=2;i<Math.sqrt(n);i++)

    /********* print prime no in a range. *********/
    // public static void primesInRange(int n){
    // for(int i=2;i<=n;i++){
    // if(isPrime(i)){//true
    // System.out.print(i+" ");
    // }
    // }
    // }
    // public static void main(String[] args){
    // primesInRange(20);
    // }
}