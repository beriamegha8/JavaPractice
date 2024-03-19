public class PalindromeNum {
    public static void main(String[] args) {
        int num = 123321;
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
