package Lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateWeaponPanel implements WeaponsPanel {
    /****Attributes****/
    //Array of available weapons for this mode
    private List<String> weapons = new ArrayList<>();
    /****Constructor****/
    public IntermediateWeaponPanel() {
        weapons.add("Mace of Healing");
        weapons.add("Auto-Crossbow");
        weapons.add("Glamdring");
    }
    /****Methods****/
    //add new Weapon to panel
    @Override
    public void addWeapon(String n) {
        weapons.add(n);
    }
    //Display available Weapons
    @Override
    public void displayWeapons() {
        System.out.println("Weapons:");
        Stream.of(weapons.toString())
                .forEach(System.out::println);
    }
}