class Vehicles {
    int manufYear;
    void displayVehicle() {
        System.out.println("Manufacturer Year: "+manufYear);
    }
}

class car extends Vehicles {
    int noofWheels;
    String color;
    void displayCar() {
        System.out.println("Manufacturer Year: "+manufYear);
        System.out.println("No. of Wheels: "+noofWheels);
        System.out.println("Color: "+color);
    }
}

class SportsCar extends car {
    boolean isConvertible;
    void displaySC() {
        System.out.println("SportsCar");
        System.out.println("Manufacturer Year: "+manufYear);
        System.out.println("No. Of Wheels: "+noofWheels);
        System.out.println("Color: "+color);
        System.out.println("Convertible: "+isConvertible);

    }
}
public class Multilevelinh {
    public static void main(String []args){
        SportsCar s= new SportsCar();
        s.manufYear= 2021;
        s.noofWheels= 4;
        s.color= "Red";
        s.isConvertible= true;
        s.displaySC();
    }

}
