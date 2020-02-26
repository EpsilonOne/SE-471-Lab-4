package Lab4;

public class BeginnerFactory implements FactoryMaker {
    //Creates Panel interfaces for this mode
    @Override
    public CharactersPanel createCharactersPanel() {
        return new BeginnerCharacterPanel();
    }

    @Override
    public WeaponsPanel createWeaponsPanel() {
        return new BeginnerWeaponPanel();
    }
}
