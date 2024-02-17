class Parent{
    int a= 20;
    void displayParent(){
        System.out.println("Parent a= "+a);
    }
}

class Child extends Parent{
    int b= 10;
    void displayChild(){
        super.displayParent();
        System.out.println("Parent a= "+super.a);
        System.out.println("Parent a= "+ a);
        System.out.println("Child a= "+b);
    }
}
//single inheritance
public class Singleinheritance { //driver class, only class with main method should be public
    public static void main(String []args){
        Child c= new Child();
        c.displayChild();
        c.displayParent();
    }
}
