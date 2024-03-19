public class FinalVariableExample {
    public static void main(String[] args) {
        // Declare and initialize final variables
        final int num1 = 10;
        final String str = "Hello";

        // Attempt to change the value of final variables (this will cause a compilation error)
        //num1 = 20; // Uncommenting this line will cause a compilation error
        // str = "World"; // Uncommenting this line will cause a compilation error

        // Display the values of final variables
        System.out.println("num1: " + num1);
        System.out.println("str: " + str);
    }
}
