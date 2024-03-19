class LocalInnerClass{
    int a = 10;

    void outerMethod(){
        final int outerVariable = 100;
        class localInner{
            void innerMethod(){
                System.out.println("Inside inner method");
                System.out.println("Outer variable: " + outerVariable);
            }
        }
        localInner i = new localInner();
        i.innerMethod();
    }
    public void display(){
        class Inner{
            public void msg(){
                System.out.println("Value of a is: "+a);
            }
        }
        Inner i = new Inner();
        i.msg();
    }
}
public class InnerClassEx3 {
    public static void main(String[] args) {
        LocalInnerClass l = new LocalInnerClass();
        l.outerMethod();
        l.display();
    }
}
