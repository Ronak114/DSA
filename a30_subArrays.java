public class a30_subArrays {
    // print Sub arrays.

    public static void SubArrays(int num[]) {
        int totalSubArray = 0;

        for (int i = 0; i < num.length; i++) {// start
            int start = i;
            for (int j = i; j < num.length; j++) {// i+1 nhi liya bcz single array bhi print krna hai.
                int end = j;
                for (int k = start; k <= end; k++) {// print
                    System.out.print(num[k] + " ");// subarray
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("TOTAL SUBARRAY : " + totalSubArray);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        SubArrays(num);
    }
}
// No of subarray = {n(n+1)}/2 .