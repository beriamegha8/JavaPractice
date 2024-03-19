interface Calculatorr {
    int add(int x, int y);
}

class AnonymousInnerClass {
    int iv = 100;
    static int cv = 200;

    void method() {
        int lv = 300;
        final int flv = 400;

        // Anonymous inner class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Local variable: " + lv);
                System.out.println("Final local variable: " + flv);
                System.out.println("Instance variable: " + iv);
                System.out.println("Class variable: " + cv);
            }
        };
        r.run();
    }
}

    public class InnerClassEx4 {
    public static void main(String[] args) {
        AnonymousInnerClass a = new AnonymousInnerClass();
        a.method();

        // Using inner classes
        Outer outer = new Outer();
        outer.outerMethod();
    }
}

class Outer {
    private int outerVar = 100;

    // Inner class
    class Inner {
        private int innerVar = 200;

        void display() {
            System.out.println("Inner class method");
            System.out.println("Outer variable: " + outerVar);
            System.out.println("Inner variable: " + innerVar);
        }
    }

    void outerMethod() {
        System.out.println("Outer class method");
        // Creating an instance of the inner class
        Inner inner = new Inner();
        inner.display();
    }
}
