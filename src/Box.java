class LetsBox {
    private double length;
    private double width;
    private double height;

    // Constructor
    public LetsBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getter methods to retrieve the values of private variables
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Member function to find the volume of the box
    public double calculateVolume() {
        return length * width * height;
    }

    // Member function to print the volume of the box
    public void printVolume() {
        System.out.println("Volume of the box: " + calculateVolume());
    }
}

public class Box {
    public static void main(String[] args) {
        LetsBox myLetsBox = new LetsBox(3.0, 4.0, 5.0);

        // Access private variables using getter methods
        System.out.println("Length: " + myLetsBox.getLength());
        System.out.println("Width: " + myLetsBox.getWidth());
        System.out.println("Height: " + myLetsBox.getHeight());

        // Call the member function to print the volume of the box
        myLetsBox.printVolume();
    }
}
