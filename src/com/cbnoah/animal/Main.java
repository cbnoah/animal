import com.cbnoah.animal.Cow;
import static com.cbnoah.animal.Animal.commonRule;

void main() {
    Cow cow = new Cow("com.cbnoah.animal.Cow", "Moo", 5);
    IO.println(cow.getSound());
    IO.println(commonRule());
}
