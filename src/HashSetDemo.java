import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<String>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Papaya");

        // Display the elements of the HashSet
        System.out.println("Elements of the HashSet: " + set);

        boolean removed= set.remove("Mango");
        if (removed) {
            System.out.println("Mango is removed from the HashSet");
        } else {
            System.out.println("Mango is not present in the HashSet");
        }

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        boolean contains = set.contains("Apple");
        System.out.println("Does the HashSet contain Apple? " + contains);

        // Get the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);

        // Check if the HashSet is empty
        isEmpty = set.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        //Iterating over the elements of the HashSet
        System.out.println("Elements of the HashSet:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Display the elements of the HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clear the HashSet
        set.clear();
        System.out.println("Cleared the HashSet");
    }
}
