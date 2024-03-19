class Dog {
    private String name;
    private int age;
    private String breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        System.out.println(this.name + " is Barking");
    }
}

public class DogFunctions{
    public static void main(String []args) {
        Dog d1 = new Dog();
        System.out.println("Before getter and setter methods");
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getBreed());

        d1.setName("Tommy");
        d1.setAge(5);
        d1.setBreed("Labrador");
        System.out.println("After getter and setter methods");
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getBreed());

    }
}
