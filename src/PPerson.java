//public class PPersons {
//    private static int count = 0;
//    private final int id;
//    private String name;
//    private int age;
//    private String address;
//    private String email;
//
//    public PPersons() {
//        this.id = ++count;
//    }
//    public PPersons(String name, int age, String address, String email) {
//        this.id = ++count;
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.email = email;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void printDetails() {
//        System.out.println("PPersons ID: " + getId());
//        System.out.println("Name: " + getName());
//        System.out.println("Age: " + getAge());
//        System.out.println("Address: " + getAddress());
//        System.out.println("Email: " + getEmail());
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        PPersons p1 = new PPersons();
//        p1.setName("Alice");
//        p1.setAge(25);
//        p1.setAddress("123 Main St, Cityville");
//        p1.setEmail("alice@example.com");
//
//        PPersons p2 = new PPersons();
//        p2.setName("Bob");
//        p2.setAge(30);
//        p2.setAddress("456 Oak St, Townburg");
//        p2.setEmail("bob@example.com");
//
//        PPersons p3 = new PPersons();
//        p3.setName("Charlie");
//        p3.setAge(22);
//        p3.setAddress("789 Pine St, Villagetown");
//        p3.setEmail("charlie@example.com");
//
//        p1.printDetails();
//        p2.printDetails();
//        p3.printDetails();
//    }
//}
public class PPerson {
    private int age;

    public PPerson(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        PPerson persons1 = new PPerson(12);
        persons1.amIOld(); // Output: You are young.

        PPerson persons2 = new PPerson(17);
        persons2.yearPasses();
        persons2.amIOld(); // Output: You are a teenager.

        PPerson persons3 = new PPerson(-1);
        persons3.amIOld(); // Output: Age is not valid, setting age to 0. You are young.
    }
}
