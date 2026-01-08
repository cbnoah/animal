public class Cat extends Animal implements Wild {
    public Cat(String name, String sound, int age) {
        super(name, sound, age);
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println("The cat is hunting "+animal.getName()+".");
    }
}
