class Vehicle {
    int speed;
    int gear;

    // Default constructor
    public Vehicle() {
        this.speed = 0;
        this.gear = 0;
    }

    // Parameterized constructor
    public Vehicle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    void changeGear(int newGear) {
        gear = newGear;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }

    public static void main(String[] args) {
        Car car = new Car(); // Creating an instance of Car
        car.changeGear(3);
        car.speedUp(20);
        car.applyBrakes(5);
        car.printStates();

        Bmw bmwCar = new Bmw(); // Creating an instance of Bmw
        bmwCar.changeGear(5);
        bmwCar.speedUp(30);
        bmwCar.applyBrakes(10);
        bmwCar.printStates();
    }
}

class Car extends Vehicle {
    // Default constructor
    public Car() {
        super(); // Invoking the default constructor of the superclass
    }

    // Parameterized constructor
    public Car(int speed, int gear) {
        super(speed, gear); // Invoking the parameterized constructor of the superclass
    }
}

class Bmw extends Car {
    // Default constructor
    public Bmw() {
        super(); // Invoking the default constructor of the superclass
    }

    // Parameterized constructor
    public Bmw(int speed, int gear) {
        super(speed, gear); // Invoking the parameterized constructor of the superclass
    }
}
