import java.util.ArrayList;
import java.util.Scanner;

class Teacher {
    private final String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private final String title;
    private final Teacher instructor;
    private final ArrayList<Student> enrolledStudents;

    public Course(String title, Teacher instructor) {
        this.title = title;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

class Student {
    private final String name;
    private final int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Teacher teacher = new Teacher("Ms. Johnson");

        Course course1 = new Course("Mathematics", teacher);
        Course course2 = new Course("History", teacher);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));

        System.out.println("Student Management System\n");

        while (true) {
            System.out.println("1. Display Courses");
            System.out.println("2. Display Students");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Display Enrolled Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayCourses(course1, course2);
                case 2 -> displayStudents(students);
                case 3 -> enrollStudentInCourse(students, course1, course2);
                case 4 -> displayEnrolledStudents(course1, course2);
                case 5 -> {
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void displayCourses(Course... courses) {
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println("Title: " + course.getTitle());
            System.out.println("Instructor: " + course.getInstructor().getName());
            System.out.println();
        }
    }

    private static void displayStudents(ArrayList<Student> students) {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println();
        }
    }

    private static void enrollStudentInCourse(ArrayList<Student> students, Course... courses) {
        System.out.print("Enter student ID to enroll: ");
        int studentId = new Scanner(System.in).nextInt();
        Student studentToEnroll = findStudentById(students, studentId);

        if (studentToEnroll != null) {
            System.out.println("Select a course to enroll the student:");
            displayCourses(courses);

            int courseChoice = new Scanner(System.in).nextInt();
            if (courseChoice >= 1 && courseChoice <= courses.length) {
                courses[courseChoice - 1].enrollStudent(studentToEnroll);
                System.out.println("Student enrolled successfully in " + courses[courseChoice - 1].getTitle());
            } else {
                System.out.println("Invalid course choice.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void displayEnrolledStudents(Course... courses) {
        for (Course course : courses) {
            System.out.println("Enrolled Students in " + course.getTitle() + ":");
            ArrayList<Student> enrolledStudents = course.getEnrolledStudents();
            if (enrolledStudents.isEmpty()) {
                System.out.println("No students enrolled.");
            } else {
                for (Student student : enrolledStudents) {
                    System.out.println("Name: " + student.getName() + ", Student ID: " + student.getStudentId());
                }
            }
            System.out.println();
        }
    }

    private static Student findStudentById(ArrayList<Student> students, int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }
}
