public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        StringBuilder reversed = new StringBuilder("0");
        int initial = x;
        while (x > 0) {
            reversed.append(x % 10);
            x /= 10;
        }
        try {
            return (initial == Integer.parseInt(reversed.toString()));
        } catch (Exception e) {
            return false;
        }
    }
}
