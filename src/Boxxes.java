// Base class
class Boxx {
    private double width;
    private double height;
    private double depth;

    // Constructor for Boxx
    public Boxx(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double volume() {
        return width * height * depth;
    }
}

// Subclass inheriting from Boxx
class BoxxWeight extends Boxx {
    private double weight;

    // Constructor for BoxxWeight
    public BoxxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth); // Call constructor of superclass
        this.weight = weight;
    }

    // Method to display weight
    public void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

// Subclass inheriting from BoxxWeight
class ShipmentCost extends BoxxWeight {
    private double costPerUnit;

    // Constructor for ShipmentCost
    public ShipmentCost(double width, double height, double depth, double weight, double costPerUnit) {
        super(width, height, depth, weight); // Call constructor of superclass
        this.costPerUnit = costPerUnit;
    }

    // Method to calculate shipment cost
    public double calculateCost() {
        return volume() * costPerUnit;
    }
}

public class Boxxes {
    public static void main(String[] args) {
        ShipmentCost shipment = new ShipmentCost(10, 20, 15, 25, 2.5);
        double cost = shipment.calculateCost();
        System.out.println("Cost: $" + cost);
    }
}
