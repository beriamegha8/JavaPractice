import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapFreqWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph:");
        String input = sc.nextLine();

        // Split the input into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Common words to be excluded from frequency count
        String[] commonWords = {"the", "and", "is", "are", "in", "on", "at"};

        // Iterate through the words
        for (String word : words) {
            // Convert the word to lowercase
            word = word.toLowerCase();

            // Check if the word is a common word
            boolean isCommon = false;
            for (String commonWord : commonWords) {
                if (word.equals(commonWord)) {
                    isCommon = true;
                    break;
                }
            }

            // If the word is a common word, skip it
            if (isCommon) {
                continue;
            }

            // If the word is already present in the HashMap, increment its frequency
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Display the frequency of each word
        System.out.println("Frequency of each word (excluding common words):");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
