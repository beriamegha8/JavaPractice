import java.util.Scanner;

// Custom exception for invalid temperature input
class InvalidTempException extends Exception {
    public InvalidTempException(String message) {
        super(message);
    }
}

// Custom exception for out of range temperature
class OutOfRangeTempException extends Exception {
    public OutOfRangeTempException(String message) {
        super(message);
    }
}

public class TemperatureConverter {
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) throws OutOfRangeTempException {
        if (celsius < -273.15) {
            throw new OutOfRangeTempException("Celsius temperature cannot be below -273.15°C (absolute zero)");
        }
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) throws OutOfRangeTempException {
        if (fahrenheit < -459.67) {
            throw new OutOfRangeTempException("Fahrenheit temperature cannot be below -459.67°F (absolute zero)");
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt the user to choose the conversion direction
            System.out.println("Choose conversion:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            int choice = scanner.nextInt();

            // Prompt the user to enter the temperature
            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();

            // Perform the chosen conversion and display the result
            switch (choice) {
                case 1:
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                    break;
                case 2:
                    System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (OutOfRangeTempException e) {
            System.out.println("Temperature out of range: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
