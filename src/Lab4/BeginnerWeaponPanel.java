package Lab4;
import java.util.Arrays;

public class BeginnerWeaponPanel implements WeaponsPanel {
    /****Attributes****/
    //Array of available weapons for this mode
    private String[] weapons = {"Short Bow", "Mace"};
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

