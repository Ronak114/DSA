import java.util.Scanner;

public class a14_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // // star pattern..line no uthe ne times star
        // for (int i = 1; i <= 4; i++) { // outer line
        //     for (int j = 1; j <= i; j++) { //inner lines
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Inverted star pattern.
        // for (int i = 1; i <= 4; i++) {
        //     // mam logic ...for(int j=1;j<=4-i+1;j++)
        //     for (int j = 4; j >= i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // half pyramid.
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // //print continue character.
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
