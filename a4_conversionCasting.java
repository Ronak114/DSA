public class a4_conversionCasting {
    public static void main(String args[]) {
        /************ Type Conversion ************/
        // going from small to big
        int a = 67;
        long b = a;
        System.out.println(b); 

        // give an error of incompability
        // long c=78;
        // int d=c;
        // System.out.println(d);

        /************ Type Casting***** */
        float m = 99.56f;
        int n = (int) m;
        System.out.println(n);

        char r = 'a';
        int num = r;
        System.out.println(num); //ascii value

        /********* Type Promotion in Expression****** */
        char p = 'a';
        char q = 'z';
        //first both p and q are converted into int

        /*********** type promotion alys occur with only expression********* */
        System.out.println((int) (q));
        System.out.println((int) (p));
        System.out.println(q - p);

        // another example
        byte u = 5;
        // u=u*2;..gives error as it is a expression it has converted it into int.
        u = (byte) (u * 2);// paranthesis are imp
        System.out.println(u);

    }
}
