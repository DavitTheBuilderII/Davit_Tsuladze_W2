import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        // Create a new Dog object and set its attributes using user input
        Dog dog = new Dog();
        System.out.println("Seiyvane dzaglis saxeli:");
        dog.setName(Input.nextLine());
        System.out.println("Sheiyvane dzaglis asaki:");
        dog.setAge(Input.nextInt());
        Input.nextLine(); // consume the remaining newline character
        dog.setType(AnimalType.MAMMAL);
        System.out.println("Sheiyvane dzaglis sacxovrebeli adgili:");
        dog.setHabitat(Input.nextLine());
        System.out.println("Seiyvane dzaglis jishi:");
        dog.setBreed(Input.nextLine());
        System.out.println("dzagli gawvrtnilia? (true an false):");
        dog.setIsTrained(Input.nextBoolean());

        Input.nextLine(); // consume the remaining newline character
        // Create a new Parrot object and set its attributes using user input
        Parrot parrot = new Parrot();
        System.out.println("Sheiyvane tutiyushis saxeli :");
        parrot.setName(Input.nextLine());
        System.out.println("Sheiyvane tutiyushis asaki:");
        parrot.setAge(Input.nextInt());
        Input.nextLine(); // consume the remaining newline character
        parrot.setType(AnimalType.BIRD);
        System.out.println("Sheiyvane tutiyushis sacxovrebeli adgili:");
        parrot.setHabitat(Input.nextLine());
        System.out.println("Sheiyvane tutiyushis feri:");
        parrot.setColor(Input.nextLine());

        dog.bark();
        parrot.fly();
        parrot.playWith();
    }
}
