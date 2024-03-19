public class CharacterInfoMain {
    public static void main(String[] args) {
        // Characters for which ASCII values will be printed
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '@', ' '};

        // Display ASCII values
        for (char c : characters) {
            System.out.println("ASCII value of '" + c + "' is: " + (int) c);
        }
    }
}

