class Drink {
    protected String name;
    protected double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Drink: " + name);
        System.out.println("Price: " + price);
    }
}

class WithSoda extends Drink {
    private final String sodaType;

    public WithSoda(String name, double price, String sodaType) {
        super(name, price);
        this.sodaType = sodaType;
    }

    public void displayWithSoda() {
        System.out.println("Drink with Soda: " + name);
        System.out.println("Price: " + price);
        System.out.println("Soda Type: " + sodaType);
    }
}

class WithoutSoda extends Drink {
    public WithoutSoda(String name, double price) {
        super(name, price);
    }
}

class Hard extends Drink {
    private final double alcoholContent;

    public Hard(String name, double price, double alcoholContent) {
        super(name, price);
        this.alcoholContent = alcoholContent;
    }

    public void displayHard() {
        System.out.println("Hard Drink: " + name);
        System.out.println("Price: " + price);
        System.out.println("Alcohol Content: " + alcoholContent + "%");
    }
}

class Soft extends Drink {
    private final boolean carbonated;

    public Soft(String name, double price, boolean carbonated) {
        super(name, price);
        this.carbonated = carbonated;
    }

    public void displaySoft() {
        System.out.println("Soft Drink: " + name);
        System.out.println("Price: " + price);
        System.out.println("Carbonated: " + carbonated);
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        WithSoda withSoda = new WithSoda("Coke", 2.5, "Regular");
        withSoda.displayWithSoda();

        WithoutSoda withoutSoda = new WithoutSoda("Water", 1.0);
        withoutSoda.display();

        Hard hard = new Hard("Whiskey", 5.0, 40.0);
        hard.displayHard();

        Soft soft = new Soft("Orange Juice", 2.0, true);
        soft.displaySoft();
    }
}
