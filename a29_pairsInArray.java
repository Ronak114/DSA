public class a29_pairsInArray {
    // pairs in array.
    public static void pairArray(int num[]) {
        int totalPair = 0;
        
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];// 2,4,6,8,10
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("total pairs :" + totalPair);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        pairArray(num);
    }
}
// sum of total pairs=sum of ap={n(n-1)}/2;
// TC=O(n^2);
