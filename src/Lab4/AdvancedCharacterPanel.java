package Lab4;
import java.util.Arrays;

public class AdvancedCharacterPanel implements CharactersPanel {
    /****Attributes****/
    //Array of available characters for this mode
    private String[] characters = {"Gladiator", "High Priest", "Warlock", "Sorceress"};
    /****Methods****/
    @Override
    public void addCharacter(String n) {
        ;
    }
    //Display available Characters
    @Override
    public void displayCharacters() {
        System.out.println("Characters: "+Arrays.toString(characters));
    }
}

