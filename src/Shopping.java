import java.util.Scanner;

class Item {
    private final String name;
    private final double price;
    private final String category;

    public Item(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

class Customer {
    private String name;
    private String email;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Order {
    private Customer customer;
    private Item item;
    private int quantity;
    private String orderDate;

    public Order() {
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Item: " + item.getName());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + (quantity * item.getPrice()));
        System.out.println("Order Date: " + orderDate);
        System.out.println();
    }
}

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item[] items = {
                new Item("Laptop", 1200.0, "Electronics"),
                new Item("Smartphone", 800.0, "Electronics"),
                new Item("Headphones", 100.0, "Electronics"),
                new Item("Book", 20.0, "Books"),
                new Item("Shoes", 50.0, "Fashion")
        };

        System.out.println("Available Items:");
        for (Item item : items) {
            System.out.println("Name: " + item.getName() + ", Price: $" + item.getPrice());
        }

        System.out.println("\nEnter your order details:");

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        Item selectedItem = findItem(items, itemName);

        if (selectedItem == null) {
            System.out.println("Invalid item name. Exiting...");
            return;
        }

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter order date: ");
        String orderDate = scanner.nextLine();

        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setEmail(customerEmail);

        Order order = new Order();
        order.setCustomer(customer);
        order.setItem(selectedItem);
        order.setQuantity(quantity);
        order.setOrderDate(orderDate);

        System.out.println();
        order.displayOrderDetails();

        scanner.close();
    }

    private static Item findItem(Item[] items, String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}
