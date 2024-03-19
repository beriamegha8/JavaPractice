import java.util.ArrayList;
import java.util.List;

// Base class for all products
class Prod {
    private final String name;
    private final double price;

    public Prod(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Subclass for Electronics
class Electronics extends Prod {
    private final String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

// Subclass for Clothing
class Clothing extends Prod {
    private final String size;
    private final String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}

// Subclass for Books
class Books extends Prod {
    private final String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

// Online shopping system
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Creating some sample products
        Electronics laptop = new Electronics("Laptop", 999.99, "Dell");
        Clothing shirt = new Clothing("Shirt", 29.99, "Medium", "Cotton");
        Books novel = new Books("To Kill a Mockingbird", 15.99, "Harper Lee");

        // Adding products to a shopping cart
        List<Prod> shoppingCart = new ArrayList<>();
        shoppingCart.add(laptop);
        shoppingCart.add(shirt);
        shoppingCart.add(novel);

        // Displaying the contents of the shopping cart
        System.out.println("Shopping Cart:");
        for (Prod product : shoppingCart) {
            if (product instanceof Electronics electronicProd) {
                System.out.println("Electronic: " + electronicProd.getName() + ", Brand: " + electronicProd.getBrand() + ", Price: $" + electronicProd.getPrice());
            } else if (product instanceof Clothing clothingProd) {
                System.out.println("Clothing: " + clothingProd.getName() + ", Size: " + clothingProd.getSize() + ", Material: " + clothingProd.getMaterial() + ", Price: $" + clothingProd.getPrice());
            } else if (product instanceof Books bookProd) {
                System.out.println("Book: " + bookProd.getName() + ", Author: " + bookProd.getAuthor() + ", Price: $" + bookProd.getPrice());
            }
        }
    }
}

