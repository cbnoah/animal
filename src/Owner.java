import java.util.ArrayList;

public class Owner {
    private final String name;
    private final ArrayList<Animal> animals;

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimals(Animal animals) {
        this.animals.add(animals);
    }

    public Owner(String name, ArrayList<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }
}
