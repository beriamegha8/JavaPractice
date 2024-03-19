public class ExcepNestedTry {
    public static void main(String[] args) {
        int array[] = new int[5];
        try {
            array[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //System.out.println("Error: Division by zero");
            try {
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e2) {
                System.out.println("Error: Division by zero");
            }
        }
    }
}
