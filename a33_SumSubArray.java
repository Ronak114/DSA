public class a33_SumSubArray {
    // print Max sum of Sub arrays (most optimized way).
    // Kadane's Algorithm

    // if all the no. in array is neg.it will give 0 as o/p
    // *****************************
    public static void kadanes(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum :" + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(num);
    }
}
// TC = O(n);
//try for all negative elements..take smallest neg no.
