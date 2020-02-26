package Lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedCharacterPanel implements CharactersPanel {
    /****Attributes****/
    //List of available characters for this mode
    private List<String> characters = new ArrayList<>();
    /****Constructor****/
    public AdvancedCharacterPanel() {
        characters.add("Gladiator");
        characters.add("High Priest");
        characters.add("Warlock");
        characters.add("Sorceress");
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

