public class DistanceCalculator {

    // Method to calculate distance between two points in meters
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Overloaded method to calculate distance between two points in kilometers
    public static double calculateDistance(double x1, double y1, double x2, double y2, boolean inKilometers) {
        double distanceInMeters = calculateDistance(x1, y1, x2, y2);
        if (inKilometers) {
            return metersToKilometers(distanceInMeters);
        } else {
            return distanceInMeters;
        }
    }

    // Method to convert distance in meters to kilometers
    private static double metersToKilometers(double meters) {
        return meters / 1000.0;
    }

    public static void main(String[] args) {
        // Example usage
        double x1 = 0.0, y1 = 0.0; // coordinates of point 1
        double x2 = 3.0, y2 = 4.0; // coordinates of point 2

        // Calculate distance in meters
        double distanceInMeters = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the points in meters: " + distanceInMeters + " meters");

        // Calculate distance in kilometers using overloaded method
        double distanceInKilometers = calculateDistance(x1, y1, x2, y2, true);
        System.out.println("Distance between the points in kilometers: " + distanceInKilometers + " kilometers");
    }
}
