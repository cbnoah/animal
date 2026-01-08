public class Dog extends Animal implements Pet {
    public Dog(String name, String sound, int age) {
        super(name, sound, age);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}
