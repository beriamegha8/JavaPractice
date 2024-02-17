class Animal{
    String color = "white";

    public static void displayAnimalCount() {
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    void displayA(){
        System.out.println("Animal is barking");
        System.out.println("Color: "+color);
    }
}

class Dogs extends Animals {
    String feature = "on land";
    void bark(){
        System.out.println("Dog is barking");
    }
    void wagTail(){
        System.out.println("Dog is wagging its tail");
    }
    void displayE(){
        String color = null;
        System.out.println("Color: "+color);
        System.out.println("Feature: "+feature);
    }
}

class Labrador extends Dogs {
    String size = "large";
    void retrieve(){
        System.out.println("Labrador is retrieving");
    }
    void swim(){
        System.out.println("Labrador is swimming");
    }
    void displayL(){
        System.out.println("Labrador is barking");
        String color= null;
        System.out.println("Color: "+color);
        System.out.println("Feature: "+feature);
        System.out.println("Size: "+size);
    }
}

public class Mammal {
    public static void main(String []args){
        Labrador l= new Labrador();
        l.displayL();
        l.displayE();
        l.bark();
        l.retrieve();
        l.swim();
    }
}
