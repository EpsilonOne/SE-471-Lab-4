package Lab4;
import java.util.Arrays;

public class AdvancedWeaponPanel implements WeaponsPanel {
    /****Attributes****/
    //Array of available weapons for this mode
    private String[] weapons = {"Excalibur", "Staff of Warding", "Energy Mace", "Orb of Power"};
    /****Methods****/
    //setter
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