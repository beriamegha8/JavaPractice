public class Shape {
    float area(float a, float b) {
        return a * b;
    } // Area of Rectangle

    double area(double a, double b) {
        return a * b;
    } // Area of Square

    int area(int b, int h) {
        return b * h;
    } // Area of Parallelogram
    int area(int b, int h, int a) {
        return (b + a) * h / 2;
    } // Area of Trapezium
    double area(double r) {
        return 3.14 * r * r;
    } // Area of Circle
    public static void main(String[] args) {
        Shape obj = new Shape();
        System.out.println("Area of Rectangle: " + obj.area(10f, 20f));
        System.out.println("Area of Square: " + obj.area(10.5, 10.5));
        System.out.println("Area of Parallelogram: " + obj.area(10, 20));
        System.out.println("Area of Trapezium: " + obj.area(10, 20, 30));
        System.out.println("Area of Circle: " + obj.area(10.5));
    }
}
