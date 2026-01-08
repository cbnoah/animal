public class Animal {
    // Attribut en privé pour que les accès se fassent via les getters
    private final String name;
    private final String sound;
    private final int age;

    public Animal(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    // Getters en protected pour qu'uniquement les sous-classes puissent y accéder
    protected String getName() {
        return name;
    }

    protected String getSound() {
        return sound;
    }

    protected int getAge() {
        return age;
    }

    public static String commonRule() {
        return "All animals need food and water to survive.";
    }

    // Méthode eat à être redéfinit dans les sous-classes
    protected void eat() {
        System.out.println("An animal is eating.");
    }

    protected void eat(String food) {
        System.out.println("The animal is eating " + food + ".");
    }
}
