public class NumberConverter {

    // Method to convert String to Integer
    public static Integer stringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("Error: Cannot convert the string to an integer.");
            return null;
        }
    }

    // Method to convert Integer to String
    public static String integerToString(Integer num) {
        if (num == null) {
            System.err.println("Error: Cannot convert a null integer to a string.");
            return null;
        }
        return String.valueOf(num);
    }

    // Method to convert Double to String
    public static String doubleToString(Double num) {
        if (num == null) {
            System.err.println("Error: Cannot convert a null double to a string.");
            return null;
        }
        return String.valueOf(num);
    }

    // Method to convert String to Double
    public static Double stringToDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.err.println("Error: Cannot convert the string to a double.");
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        String str = "123";
        Integer integer = stringToInteger(str);
        System.out.println("Integer: " + integer);

        Double doubleNum = 123.456;
        String doubleStr = doubleToString(doubleNum);
        System.out.println("Double String: " + doubleStr);

        String str2 = "456.789";
        Double doubleNum2 = stringToDouble(str2);
        System.out.println("Double: " + doubleNum2);
    }
}
