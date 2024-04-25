public class a17_callByVal {

    public static void swap(int c,int d){
        //swaping.
        int temp=c;
        c=d;
        d=temp;
        System.out.println(c);
        System.out.println(d);
        //the change will not be outside the funtn
    }
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println("after swaping");
        swap(a,b);
        
        System.out.println("still printing a and b");
        //this will print the original value.
        System.out.println(a);
        System.out.println(b);
       //System.out.println(c);....will throw the error      
    }
}
