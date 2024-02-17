class nonStaticInnerClassEx {
    private int outerVariable = 100;
    public int getOuterVariable() {
        return outerVariable;
    }
    class inner {
        public void displayOuterVariable() {
            System.out.println("This is an inner class");
            System.out.println("Outer variable: " + outerVariable);
        }
    }

    void useInner() { //method of outer class
        inner innerObject = new inner();
        innerObject.displayOuterVariable();
    }
}

public class InnerClassEx {
    public static void main(String[] args) {
        nonStaticInnerClassEx outerObject = new nonStaticInnerClassEx();
        outerObject.useInner();

        nonStaticInnerClassEx.inner innerObject = outerObject.new inner();
        innerObject.displayOuterVariable();
    }
}
