class Parentt {
    int parentVar;

    // Default constructor
    public Parentt() {
        parentVar = 0;
        System.out.println("Parentt default constructor called");
    }

    // Parameterized constructor
    public Parentt(int parentVar) {
        this.parentVar = parentVar;
        System.out.println("Parentt parameterized constructor called");
    }
}

class Childd extends Parentt {
    int childVar;

    // Default constructor
    public Childd() {
        // Call default constructor of parent class
        super();
        childVar = 0;
        System.out.println("Childd default constructor called");
    }

    // Parameterized constructor
    public Childd(int parentVar, int childVar) {
        // Call parameterized constructor of parent class
        super(parentVar);
        this.childVar = childVar;
        System.out.println("Childd parameterized constructor called");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Creating objects using default constructors
        Childd child1 = new Childd();
        System.out.println();

        // Creating objects using parameterized constructors
        Childd child2 = new Childd(10, 20);
    }
}
