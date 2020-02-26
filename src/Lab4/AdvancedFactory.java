package Lab4;

public class AdvancedFactory implements FactoryMaker {//Concrete Factory
   /***Methods***/
   //Creates Panel interfaces for this mode
    @Override
    public CharactersPanel createCharactersPanel() {
        return new AdvancedCharacterPanel();
    }

    @Override
    public WeaponsPanel createWeaponsPanel() {
        return new AdvancedWeaponPanel();
    }
}
