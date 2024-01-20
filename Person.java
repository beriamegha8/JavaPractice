public class Person {
    private static int count = 0;
    private final int id;
    private String name;
    private int age;
    private String address;
    private String email;

    public Person() {
        this.id = ++count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void printDetails() {
        System.out.println("Person ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println();
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Alice");
        p1.setAge(25);
        p1.setAddress("123 Main St, Cityville");
        p1.setEmail("alice@example.com");

        Person p2 = new Person();
        p2.setName("Bob");
        p2.setAge(30);
        p2.setAddress("456 Oak St, Townburg");
        p2.setEmail("bob@example.com");

        Person p3 = new Person();
        p3.setName("Charlie");
        p3.setAge(22);
        p3.setAddress("789 Pine St, Villagetown");
        p3.setEmail("charlie@example.com");

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
    }
}
