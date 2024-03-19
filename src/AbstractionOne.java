abstract class Shapee {
    static int noofshapes;

    Shapee() {
        noofshapes++;
    }

    abstract void draw(); //we can create a method without a body since we've used abstract keyword

    static void displayNoOfShapes() {
        System.out.println("No of shapes: " + noofshapes);
    }

    void displayInfo() {
        System.out.println("This is a shape");
    }
}

class Rectanglee extends Shapee {
    //I have to define method body for draw(), since it's an abstract method in the parent class
//    void draw() {
//        System.out.println("Rectangle is drawing");
//    }

    @Override
    void draw() {
        System.out.println("Rectangle is drawing");
    }

    void displayInfo() {
        System.out.println("This is a rectangle");
    }

    void area(float a, float b) {
        System.out.println("Area of rectangle is : " + a * b);
    }
}

class Circlee extends Shapee {
    @Override
    void draw() {
        System.out.println("Circle is drawing");
    }

    void area(float a) {
        System.out.println("Area of circle is : " + 3.14 * a * a);
    }
}
public class AbstractionOne {
    public static void main(String[] args) {
        Shapee o= new Shapee() {
            @Override
            void draw() {
                System.out.println("Drawing a shape");
            }
        };
        o.draw();
        Rectanglee obj = new Rectanglee();
        obj.draw();
        obj.displayInfo();
        Shapee.displayNoOfShapes();
        obj.area(10, 20);

        Shapee obj1 = new Rectanglee(); //upcasting
        Rectanglee.displayNoOfShapes();
        obj1.draw();
        obj1.displayInfo();
        Shapee.displayNoOfShapes();

        Shapee obj2 = new Circlee();
        obj2.draw();
        obj2.displayInfo();
        Shapee.displayNoOfShapes();
    }
}
