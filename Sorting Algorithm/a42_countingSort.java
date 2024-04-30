
//val(range) should be small
public class a42_countingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];//bcz start from 0
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0; //original val
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;//freq ko decrease krna
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 4, 3, 7 };
        countingSort(arr);
        printArray(arr);
    }

}
// for negative no

// import java.util.Arrays;
// public class CountingSort {

//     public static int[] countingSort(int[] arr) {
//         // Find the range of input elements
//         int maxVal = Arrays.stream(arr).max().getAsInt();
//         int minVal = Arrays.stream(arr).min().getAsInt();
//         int rangeOfElements = maxVal - minVal + 1;

//         // Initialize count array
//         int[] count = new int[rangeOfElements];

//         // Count the occurrences of each element
//         for (int num : arr) {
//             count[num - minVal]++;
//         }

//         // Update the count array to store the cumulative count
//         for (int i = 1; i < rangeOfElements; i++) {
//             count[i] += count[i - 1];
//         }

//         // Create the output array
//         int[] output = new int[arr.length];

//         // Build the output array using the count array
//         for (int i = arr.length - 1; i >= 0; i--) {
//             output[count[arr[i] - minVal] - 1] = arr[i];
//             count[arr[i] - minVal]--;
//         }

//         return output;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, -2, 8, -1, -5, 2, -7, 7};
//         int[] sortedArr = countingSort(arr);

//         System.out.print("Sorted Array: ");
//         for (int num : sortedArr) {
//             System.out.print(num + " ");
//         }
//     }
// }
