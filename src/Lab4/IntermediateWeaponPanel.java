package Lab4;
import java.util.Arrays;

public class IntermediateWeaponPanel implements WeaponsPanel {
    /****Attributes****/
    //Array of available weapons for this mode
    private String[] weapons = {"Mace of Healing", "Auto-Crossbow", "Glamdring"};
    /****Methods****/
    @Override
    public void addWeapon(String n) {
        ;
    }
    //Displays available weapons for this mode
    @Override
    public void displayWeapons() {
        System.out.println("Weapons: "+Arrays.toString(weapons));
    }
}