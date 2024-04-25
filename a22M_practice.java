public class a22M_practice {
    // to check palindrome or not?
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int rev = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;
            rev = rev * 10 + rem;
            palindrome = palindrome / 10;
        }
        if (n == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int palindrome = 121;
        if (isPalindrome(palindrome)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}