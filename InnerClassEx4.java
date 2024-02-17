interface calculator {
    int add(int x, int y);
}
//class AnonymousInnerClass {
//    int iv = 100;
//    static int cv = 200;
//    void method() {
//        int lv = 300;
//        final int flv = 400;
//        //anonymous inner class
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Local variable: " + lv);
//                System.out.println("Final local variable: " + flv);
//                System.out.println("Instance variable: " + iv);
//                System.out.println("Class variable: " + cv);
//            }
//        };
//        r.run();
//    }
//}
public class InnerClassEx4 {
    public static void main(String[] args) {
//        AnonymousInnerClass a = new AnonymousInnerClass();
//        a.method();
        calculator c = new calculator() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        System.out.println(c.add(10, 20));
    }
}

