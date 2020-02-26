package Lab4;
import java.util.Arrays;

public class IntermediateCharacterPanel implements CharactersPanel{
    /****Attributes****/
    private String[] characters = {"Cleric", "Ranger(Not Texas)", "Wizard"};
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
