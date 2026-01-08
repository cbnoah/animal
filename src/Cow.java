public class Cow extends Animal{
    public Cow(String name, String sound, int age) {
        super(name, sound, age);
    }

    @Override
    public void eat() {
        System.out.println("The cow is eating grass.");
    }
}