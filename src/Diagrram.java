import java.util.Scanner;

abstract class Diagram {
    abstract void input();
    abstract double area();
    abstract double volume();
}

class Square extends Diagram {
    double side;

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        side = scanner.nextDouble();
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double volume() {
        return 0; // A square doesn't have volume
    }
}

class Rectangle extends Diagram {
    double length, width;

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double volume() {
        return 0; // A rectangle doesn't have volume
    }
}

class Cube extends Diagram {
    double side;

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        side = scanner.nextDouble();
    }

    @Override
    double area() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

public class Diagramm {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Cube cube = new Cube();

        System.out.println("Enter details for Square:");
        square.input();
        System.out.println("Area of Square: " + square.area());

        System.out.println("\nEnter details for Rectangle:");
        rectangle.input();
        System.out.println("Area of Rectangle: " + rectangle.area());

        System.out.println("\nEnter details for Cube:");
        cube.input();
        System.out.println("Area of Cube: " + cube.area());
        System.out.println("Volume of Cube: " + cube.volume());
    }
}
