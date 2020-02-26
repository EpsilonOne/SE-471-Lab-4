package Lab4;

public class Game {
    public void newGame(String mode) {
        FactoryUtility myFactory;
        myFactory = FactoryUtility.getInstance();
        FactoryMaker absFactory;

        if (mode == "BEGINNER") {
            System.out.println("\nBeginner Game Initialized, Choose your Character and Weapon");
            absFactory = myFactory.createFactory((FactoryUtility.Mode.BEGINNER));
        }
        else if (mode == "INTERMEDIATE") {
            System.out.println("\nIntermediate Game Initialized, Choose your Character and Weapon");
            absFactory = myFactory.createFactory(FactoryUtility.Mode.INTERMEDIATE);
        }
        else {
            System.out.println("\nAdvanced Game Initialized, Choose your Character and Weapon");
            absFactory = myFactory.createFactory(FactoryUtility.Mode.ADVANCED);
        }
        absFactory.createCharactersPanel().displayCharacters();
        absFactory.createWeaponsPanel().displayWeapons();
    }

    public static void main(String[] args) {
        Game beginner = new Game();
        Game intermediate = new Game();
        Game advanced = new Game();
        beginner.newGame("BEGINNER");;
        intermediate.newGame("INTERMEDIATE");
        advanced.newGame("ADVANCED");
    }
}
