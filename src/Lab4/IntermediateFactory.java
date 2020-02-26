package Lab4;

public class IntermediateFactory implements FactoryMaker{
    //Creates Panel interfaces for this mode
    @Override
    public CharactersPanel createCharactersPanel() {
        return new IntermediateCharacterPanel();
    }

    @Override
    public WeaponsPanel createWeaponsPanel() {
        return new IntermediateWeaponPanel();
    }
}
