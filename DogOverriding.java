class Doggy {
    String color = "white";
    void bark(){
        System.out.println("Dog is barking");
    }
    void wagTail(){
        System.out.println("Dog is wagging its tail");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void display(){
        System.out.println("Dog is barking");
        System.out.println("Color: "+color);
    }
}
class ChildDog extends Doggy {
    String feature = "on land";
    void bark(){
        System.out.println("Child Dog is barking");
    }
    void wagTail(){
        System.out.println("Child Dog is wagging its tail");
    }
    void display(){
        System.out.println("Child Dog is barking");
        System.out.println("Color: "+color);
        System.out.println("Feature: "+feature);
    }
}
public class DogOverriding {
    public static void main(String []args){
        ChildDog d= new ChildDog();
        d.bark();
        d.wagTail();
        d.display();
        d.eat();
        //this is called dynamic method dispatch
        //child class can access parent class methods but when there's same method names
        //child class method will be called
        Doggy d1= new ChildDog();
        d1.bark();
        d1.wagTail();
        d1.display();
        Doggy d2= new ChildDog(); //upcasting- child class object is referred by parent class reference variable
        d2.bark();
        d2.wagTail();
        d2.display(); //this will call the child class method only and not the parent class method

    }
}

