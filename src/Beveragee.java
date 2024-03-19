import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Base class for all beverages
abstract class Beverage {
    private final String name;
    private boolean isHot;

    public Beverage(String name, boolean isHot) {
        this.name = name;
        this.isHot = isHot;
    }

    // Method to prepare the beverage
    public abstract void prepare();

    // Method to serve the beverage
    public void serve() {
        System.out.println("Your " + name + " is served.");
        if (isHot) {
            System.out.println("Be careful, it's hot!");
        } else {
            System.out.println("Enjoy your cold beverage!");
        }
    }

    // Method to heat the beverage
    public void heat() {
        if (!isHot) {
            System.out.println("Heating up the " + name + "...");
            try {
                TimeUnit.SECONDS.sleep(2); // Simulate heating process
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " is now hot.");
            isHot = true;
        } else {
            System.out.println(name + " is already hot.");
        }
    }

    // Method to cool down the beverage
    public void coolDown() {
        if (isHot) {
            System.out.println("Cooling down the " + name + "...");
            try {
                TimeUnit.SECONDS.sleep(2); // Simulate cooling process
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " is now cold.");
            isHot = false;
        } else {
            System.out.println(name + " is already cold.");
        }
    }
}

// Subclass representing coffee
class Coffee extends Beverage {
    private boolean hasMilk;

    public Coffee(boolean hasMilk) {
        super("Coffee", true);
        this.hasMilk = hasMilk;
    }

    // Override the prepare method to simulate coffee preparation
    @Override
    public void prepare() {
        System.out.println("Brewing coffee...");
        try {
            TimeUnit.SECONDS.sleep(3); // Simulate brewing process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coffee is ready.");
        if (hasMilk) {
            System.out.println("Adding milk...");
        }
    }

    // Method to add sugar to the coffee
    public void addSugar() {
        System.out.println("Adding sugar to the coffee...");
    }
}

// Subclass representing tea
class Tea extends Beverage {
    private String type;

    public Tea(String type) {
        super("Tea", true);
        this.type = type;
    }

    // Override the prepare method to simulate tea preparation
    @Override
    public void prepare() {
        System.out.println("Steeping tea...");
        try {
            TimeUnit.SECONDS.sleep(2); // Simulate steeping process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(type + " tea is ready.");
    }

    // Method to add lemon to the tea
    public void addLemon() {
        System.out.println("Adding lemon to the tea...");
    }
}

// Subclass representing smoothie
class Smoothie extends Beverage {
    private String flavor;

    public Smoothie(String flavor) {
        super("Smoothie", false);
        this.flavor = flavor;
    }

    // Override the prepare method to simulate smoothie preparation
    @Override
    public void prepare() {
        System.out.println("Blending " + flavor + " smoothie...");
        try {
            TimeUnit.SECONDS.sleep(4); // Simulate blending process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(flavor + " smoothie is ready.");
    }

    // Method to add protein powder to the smoothie
    public void addProteinPowder() {
        System.out.println("Adding protein powder to the smoothie...");
    }
}

// Main class to test the Beverage subclasses
public class Beveragee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which beverage would you like to have?");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Smoothie");
        System.out.print("Enter your choice (1/2/3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Beverage beverage = null;

        switch (choice) {
            case 1:
                System.out.print("Do you want milk in your coffee? (yes/no): ");
                String milkChoice = scanner.nextLine().toLowerCase();
                boolean hasMilk = milkChoice.equals("yes");
                beverage = new Coffee(hasMilk);
                break;
            case 2:
                System.out.print("What type of tea would you like? (e.g., Green, Black, Herbal): ");
                String teaType = scanner.nextLine();
                beverage = new Tea(teaType);
                break;
            case 3:
                System.out.print("What flavor of smoothie would you like? (e.g., Strawberry, Banana): ");
                String smoothieFlavor = scanner.nextLine();
                beverage = new Smoothie(smoothieFlavor);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (beverage != null) {
            beverage.prepare();
            beverage.serve();
        }

        scanner.close();
    }
}
