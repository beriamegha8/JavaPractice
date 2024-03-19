import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs (String as key, Integer as value)
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding elements to the HashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 88);

        // Displaying the HashMap
        System.out.println("HashMap: " + studentScores);

        // Getting and printing the value associated with a key
        String studentName = "Bob";
        System.out.println(studentName + "'s Score: " + studentScores.get(studentName));

        // Checking if a key exists in the HashMap
        String newStudent = "Eva";
        System.out.println("Does " + newStudent + " exist in the HashMap? " + studentScores.containsKey(newStudent));

        // Checking if a value exists in the HashMap
        int scoreToCheck = 95;
        System.out.println("Does any student have a score of " + scoreToCheck + "? " + studentScores.containsValue(scoreToCheck));

        // Updating the value associated with a key
        String updateStudent = "Charlie";
        int newScore = 98;
        if (studentScores.containsKey(updateStudent)) {
            //There is no method to update the value of a key directly
            studentScores.put(updateStudent, newScore); // Overwrites the previous value
            System.out.println("Updated " + updateStudent + "'s score to " + newScore);
        } else {
            System.out.println(updateStudent + " not found in the HashMap.");
        }

        // Removing an entry from the HashMap
        String removeStudent = "David";
        if (studentScores.containsKey(removeStudent)) {
            studentScores.remove(removeStudent);
            System.out.println(removeStudent + "'s entry removed from the HashMap.");
        } else {
            System.out.println(removeStudent + " not found in the HashMap.");
        }

        // Displaying the final HashMap
        System.out.println("Final HashMap: " + studentScores);
    }
}