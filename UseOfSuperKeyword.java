class University {
    String location;

    public University() {
        System.out.println("I am default constructor of University");
    }

    public University(String location) {
        this.location = location;
    }

    void displayUniversity() {
        System.out.println("Location of the university is : " + this.location);
    }
}

class Departement extends University{
    String departmentName;
    String location;

    public Departement() {
        // calling no args constructor of parent class
        super();
        // calling parameterrized constructor of parent class
//		super("Lavle");
        System.out.println("I am default constructor of Departement");
    }

    public Departement(String departmentName) {
        this.departmentName = departmentName;
    }

    public Departement(String departmentName, String departmentLocation) {
        this(departmentName);
        location = departmentLocation;
    }

    public Departement(String departmentName, String departmentLocation, String universityName) {
        this(departmentName, departmentLocation);
        super.location = universityName;
    }

    void displayDepartment() {
        super.displayUniversity();
        System.out.println(this.departmentName + " department is located at " + location + " in university located at " + super.location);
    }
}


public class UseOfSuperKeyword {
    public static void main(String[] args) {
        Departement departement = new Departement("Computer", "Hillbase", "Lavle");
        departement.displayDepartment();
    }
}
 