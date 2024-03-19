
class Animals {

    String species;
    int age;

    static int animalCount;

    public Animals() {
        this.species = "";
        this.age = 0;
        animalCount++;
    }

    public Animals(String species) {
        this.species = species;
        animalCount++;
    }

    public Animals(String species, int age) {
        this(species);
        this.age = age;
    }

    public void displayAnimal() {
        System.out.println("Species : " + species);
        System.out.println("Age : " + age);
    }

    public static void displayAnimalCount() {
        System.out.println("Animal Count: " + animalCount);
    }
}

public class UseOfThisKeyword_Animal {

    public static void main(String[] args) {

        Animals animals1 = new Animals("Lion", 8);
        Animals animals2 = new Animals("Dog");
        Animals animals3 = new Animals("Snake", 1);

        animals1.displayAnimal();
        animals2.displayAnimal();
        animals3.displayAnimal();
        Animal.displayAnimalCount();
    }
}
 
