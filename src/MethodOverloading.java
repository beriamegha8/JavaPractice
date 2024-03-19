public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }
    float add(float a, float b) {
        return a + b;
    }
    String add(String a, String b) {
        return a + b;
    }
    String add(int a, String b) {
        return a + b;
    }
    String add(String b, int a) {
        return a + b;
    }
    String add(String a, String b, String c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5f, 20.5f));
        System.out.println(obj.add("Hello", "World"));
        System.out.println(obj.add(10, "Hello"));
        System.out.println(obj.add("Hello", 10));
        System.out.println(obj.add("Hello", "World", "Java"));
    }
}
