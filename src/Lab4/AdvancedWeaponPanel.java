package Lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedWeaponPanel implements WeaponsPanel {
    /****Attributes****/
    //Array of available weapons for this mode
    private List<String> weapons = new ArrayList<>();
    /****Constructor****/
    public AdvancedWeaponPanel() {
        weapons.add("Excalibur");
        weapons.add("Staff of Warding");
        weapons.add("Energy Mace");
        weapons.add("Orb of Power");
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