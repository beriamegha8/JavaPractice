//to check 9666020 for repeated digits and display once in a sequence with frequency of each digit
 public class DupliChecker {
    public static void main(String[] args) {
        int num = 9666020;
        int[] freq = new int[10];
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }

        System.out.println("The number without repeated digits is--> ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.print(i);
            }
        }
        System.out.println("\nFrequency of each digit is--> ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
