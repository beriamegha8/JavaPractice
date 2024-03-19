import java.util.HashSet;
import java.util.Scanner;
public class HashSetString {
    public static void main(String[] args) {
        // Create a HashSet
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string- ");
        String str = sc.nextLine();

        //Use a hashset to store the unique characters of the string
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
        }

        //Display the unique characters of the string
        System.out.println("Unique characters in the string are: " + uniqueChars);

        // Clear the HashSet
        // uniqueChar.clear();
        //System.out.println("Cleared the HashSet");
    }
}
