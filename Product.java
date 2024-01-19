public class Product {
    String name;
    final float price= 0.0f;
    int quantity;
    public static void main(String []args){
        Product p1= new Product();
        Product p2= new Product();

        p1.name= "iPhone 12";
        p1.quantity= 10;

        p2.name= "Samsung Galaxy S21";
        p2.quantity= 15;

        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.quantity);

        System.out.println(p2.name);
        System.out.println(p2.price);
        System.out.println(p2.quantity);
    }
}
//two types of classes- POJO and POJI
// POJO- Plain Old Java Object
// POJI- Plain Old Java Interface

// POJO- class with only attributes and getters and setters
// POJI- interface with only abstract methods

//Two ways how to set variables- using getter and setter methods and using constructor
//Constructor- special method which is used to initialize the object
//Constructor name is same as class name
//Constructor does not have any return type
//Constructor is called automatically when object is created
//Constructor can be overloaded
//Constructor can be parameterized
//Constructor can be private
//Constructor can be default
//Constructor can be public
//Constructor can be protected
//Constructor can be used to initialize the variables
//Constructor can be used to initialize the object
//Constructor can be used to initialize the methods
//Constructor can be used to initialize the class
//Constructor can be used to initialize the interface
//Constructor can be used to initialize the abstract class
//Constructor can be used to initialize the abstract methods
//Constructor can be used to initialize the static variables
//Constructor can be used to initialize the static methods
//Constructor can be used to initialize the static class
//Constructor can be used to initialize the static interface
//Constructor can be used to initialize the static abstract class
//Constructor can be used to initialize the static abstract methods
//Constructor can be used to initialize the static final variables
//Constructor can be used to initialize the static final methods
//Constructor can be used to initialize the static final class
//Constructor can be used to initialize the static final interface
//Constructor can be used to initialize the static final abstract class
//Constructor can be used to initialize the static final abstract methods
//Constructor can be used to initialize the static final variables
//Constructor can be used to initialize the static final methods
//Getter and setter methods are used to set and get the values of the variables
//Getter and setter methods are used to set and get the values of the objects
//Getter and setter methods are used to set and get the values of the methods
//Getter and setter methods are used to set and get the values of the class
//Getter and setter methods are used to set and get the values of the interface
//Getter and setter methods are used to set and get the values of the abstract class
//Getter and setter methods are used to set and get the values of the abstract methods
//Getter and setter methods are used to set and get the values of the static variables
//The difference between the two is that the constructor is used to initialize the object, while the setter is used to set the value of the variable.
//The syntax for both are-
// public void setVariableName(variableType variableName){this.variableName= variableName;}
// public variableType getVariableName(){return variableName;}
