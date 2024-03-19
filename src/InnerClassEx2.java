class staticNestedClass {
    private static int cv = 100;
    int cv2 = 200;
    static class InnerClass {
        void display() {
            System.out.println("Static variable: " + cv);
            // System.out.println("Non-static variable: " + cv2); //error
        }
    }
    void useInner() {
        InnerClass innerObject = new InnerClass();
        System.out.println("Inner variable: " + cv2); //don't need an object to access non-static variable
        innerObject.display(); //need object to access static variable (since class is static)
    }

}
public class InnerClassEx2 {
    public static void main(String[] args) {
        staticNestedClass outerObject = new staticNestedClass();
        //invoking the method that uses static inner class
        outerObject.useInner(); //non-static method of outer class

        staticNestedClass.InnerClass innerObject = new staticNestedClass.InnerClass();
        innerObject.display(); //static method of inner class
    }
}