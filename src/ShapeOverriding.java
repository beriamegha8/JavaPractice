class Shapes {
    void what() {
        System.out.println("I am a shape");
    }

    void area(float a, float b) {
        System.out.println("Area of shape (any)");
    }
}

class Rectangle extends Shapes {
    @Override
    void what() {
        System.out.println("I am a rectangle");
    }

    @Override
    void area(float a, float b) {
        System.out.println("Area of rectangle is : " + a * b);
    }
}

class Triangle extends Shapes {
    @Override
    void what() {
        System.out.println("I am a triangle");
    }

    @Override
    void area(float a, float b) {
        System.out.println("Area of triangle is : " + 0.5 * a * b);
    }
}

public class ShapeOverriding {
    public static void main(String[] args) {
        Shapes obj1 = new Shapes();
        obj1.what();
        obj1.area(10, 20);

        Shapes obj2 = new Rectangle();
        obj2.what();
        obj2.area(10, 20);

        Shapes obj3 = new Triangle();
        obj3.what();
        obj3.area(10, 20);
    }
}
