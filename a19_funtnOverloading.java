public class a19_funtnOverloading {
    // //using diff no.of parameters
    // public static int sum(int a,int b){
    // return a+b;
    // }
    // public static int sum(int a,int b,int c){
    // return a+b+c;
    // }
    // public static void main(String args[]){
    // System.out.println(sum(8,9));
    // System.out.println(sum(8,9,19));
    // }

    // using diff types parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(8, 9));
        System.out.println(sum(8.0f, 9.0f));
    }
}
