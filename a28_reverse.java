import java.util.*;

public class a28_reverse {
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;

        while (first < last) {
            // swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
/* Can make directly by backward loop and coping it to original array ..TC = SC = O(n) */
//TC = O(n);
//SC = O(1);
