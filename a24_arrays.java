public class a24_arrays {
    /********passing array as arguments******** */
    public static void update(int marks[],int nonchangable){
        nonchangable=10;
       for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
        System.out.println("original :" +marks[i]);
       } 
    }
    public static void main(String args[]) {
        int nonchangable=5;
        int marks[] = { 1, 2, 3 };
        update(marks,nonchangable);

        System.out.println(nonchangable);// o/p=5...this can be proved by CALL BY VALUE.

        //print for marks.
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //yaha bhi(main funtn) mai bhi change hua 
        /**********CALL BY REFERANCE ( value will change)****** */
    }
}
