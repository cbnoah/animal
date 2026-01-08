import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Bessie", "Moo", 5);
        System.out.println("Name: " + cow.getName());
        System.out.println("Sound: " + cow.getSound());
        System.out.println("Age: " + cow.getAge());
        System.out.println("Common Rule: " + Animal.commonRule());

        cow.eat();
        Dog dog = new Dog("Buddy", "Woof", 3);
        dog.eat();

        cow.eat("hay");
        cow.eat("ynov");

        /* La classe Animal est abstraite, on ne peut pas l'instancier directement
        Animal genericAnimal = new Animal("Generic", "Sound", 1);
        genericAnimal.eat();
        genericAnimal.eat("food");
        System.out.println(genericAnimal.getAge());
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.getSound());
         */
        dog.play();

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(new Dog("Max", "Woof", 4));
        pets.add(new Dog("Max2", "Woof", 4));
        pets.add(new Dog("Max3", "Woof", 4));


        System.out.println(pets);

        for (Pet pet : pets) {
            pet.play();
        }

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cow);
        animals.add(dog);

        Owner owner = new Owner("Mathieu", animals);
        owner.addAnimals(new Dog("Rex", "Woof", 2));
        owner.addAnimals(new Cow("Daisy", "Moo", 4));

        Cat cat = new Cat("Whiskers", "Meow", 2);
        cat.hunt(dog);
    }
}