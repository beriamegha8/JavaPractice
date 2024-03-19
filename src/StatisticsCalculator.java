import java.util.List;

public class StatisticsCalculator {

    // Method to find the minimum value in a list of numbers
    public static Double findMinimum(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.err.println("Error: List is null or empty.");
            return null;
        }
        Double min = numbers.get(0);
        for (Double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the maximum value in a list of numbers
    public static Double findMaximum(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.err.println("Error: List is null or empty.");
            return null;
        }
        Double max = numbers.get(0);
        for (Double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to calculate the average of numbers in a list
    public static Double calculateAverage(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.err.println("Error: List is null or empty.");
            return null;
        }
        Double sum = 0.0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    // Method to calculate the standard deviation of numbers in a list
    public static Double calculateStandardDeviation(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.err.println("Error: List is null or empty.");
            return null;
        }
        Double average = calculateAverage(numbers);
        Double sumOfSquaredDifferences = 0.0;
        for (Double num : numbers) {
            sumOfSquaredDifferences += Math.pow(num - average, 2);
        }
        Double variance = sumOfSquaredDifferences / numbers.size();
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        // Example usage
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
    }
}
