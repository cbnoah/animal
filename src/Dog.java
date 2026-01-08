public class Dog extends Animal{
    public Dog(String name, String sound, int age) {
        super(name, sound, age);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }
}
