//import java.util.*;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(); // <String> is a generic type
        // ArrayList is a class in the java.util package
        //List<String> listOfWords = new ArrayList<>();
        System.out.println(listOfWords.size());
        listOfWords.add("Hello");
        listOfWords.add("World");
        listOfWords.add("Java");
        System.out.println(listOfWords.size());
        System.out.println(listOfWords.get(0));
        System.out.println(listOfWords.get(1));
        System.out.println(listOfWords.get(2));
        listOfWords.add(1, "Programming");
        for (String word : listOfWords) {
            System.out.println(word);
        }
        listOfWords.remove(1);
        System.out.println(listOfWords.size());
        System.out.println(listOfWords.get(0));
        System.out.println(listOfWords.get(1));
        System.out.println(listOfWords.get(2));
        System.out.println(listOfWords.get(3));// This will throw an exception- OutOfBoundsException
    }
}
