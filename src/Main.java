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

        Animal genericAnimal = new Animal("Generic", "Sound", 1);
        genericAnimal.eat();
        genericAnimal.eat("food");
        System.out.println(genericAnimal.getAge());
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.getSound());
    }
}