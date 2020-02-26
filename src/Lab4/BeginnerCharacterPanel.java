package Lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BeginnerCharacterPanel implements CharactersPanel {
    /****Attributes****/
    //List of available characters for this mode
    private List<String> characters = new ArrayList<>();
    /****Constructor****/
    public BeginnerCharacterPanel() {
        characters.add("Cleric");
        characters.add("Hunter");
    }
    /****Methods****/
    //add new character to panel
    @Override
    public void addCharacter(String n) {
        characters.add(n);
    }
    //Display available Characters
    @Override
    public void displayCharacters() {
        System.out.println("Characters:");
        Stream.of(characters.toString())
                .forEach(System.out::println);
    }
}

