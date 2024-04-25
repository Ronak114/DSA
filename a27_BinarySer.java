import java.util.*;

public class a27_BinarySer {
    public static int BinarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            //comparisons.
            if (num[mid] == key) {//equall
                return mid;
            }
            if (num[mid] < key) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 4;

        System.out.println("Index for key :"+ BinarySearch(num,key));
    }
}
