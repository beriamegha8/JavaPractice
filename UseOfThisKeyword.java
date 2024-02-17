
    //constructor cant be called normally
    // constructor can be called using this keyword

class Stud {
    int rollNo;
    String name;

    public Stud() {
        System.out.println("I am no args constructor");
    }

    public Stud(String name) {
        this.name = name;
    }

    public Stud(int rollNo) {
        this.rollNo = rollNo;
    }

    public Stud(int rollNo, String name) {
        // Third Use
//		this();
//		this(11);


        // First Use
        // Constructor Chaining
        this(name);
        this.rollNo = rollNo;
    }

    void displayStud() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
    }

    void timepassDisplay() {
        // Second Use
        this.displayStud();
//		displayStud();
    }
}

public class UseOfThisKeyword {
    public static void main(String[] args) {
        Stud student = new Stud(10, "Ravi");
        student.timepassDisplay();

        Stud student1 = new Stud("Sumit");
        student1.displayStud();

        Stud student2 = new Stud(13, "Raghav");
        student2.displayStud();
    }
}

