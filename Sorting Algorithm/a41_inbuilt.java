//decending order.
import java.util.Arrays;
//import this package
import java.util.Collections;

public class a41_inbuilt {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };

        // index
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArray(arr);

        System.out.println();

        //pura sort honga
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
// reverseOrder uses compariters.
// reverseOrder works on objects (that's why..Integer)
