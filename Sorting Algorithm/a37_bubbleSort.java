public class a37_bubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {// n times chala hai ......turn <= n-2
            for (int j = 0; j < n - 1 - turn; j++) {// n-1-turns tym chla hai.
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
        printArray(arr);
    }
}
// TC=O(n^2).

// // write code for sorted error with tc O(n).

// public class OptimizedBubbleSort {
// public static void optimizedBubbleSort(int[] arr) {
// int n = arr.length;
// boolean swapped;

// for (int i = 0; i < n - 1; i++) {
// swapped = false;
// for (int j = 0; j < n - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// // Swap
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;

// swapped = true;
// }
// }
// // If no two elements were swapped by inner loop, the array is already sorted
// if (!swapped) {
// break;
// }
// }
// }

// public static void main(String[] args) {
// int[] myArray = { 11, 12, 22, 25, 34, 64, 90 };

// optimizedBubbleSort(myArray);

// System.out.print("Sorted array: ");
// for (int value : myArray) {
// System.out.print(value + " ");
// }
// }
// }
