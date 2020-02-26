package Lab4;

public class FactoryUtility {

    //single instance of this class
    private static FactoryUtility myInstance = new FactoryUtility();

    //enum for mode types
    public enum Mode{
        BEGINNER, INTERMEDIATE, ADVANCED;
    }

    public static FactoryUtility getInstance(){
        return myInstance;
    }
    //Return new object that implements the ModeFactoryIF for given type.
    public FactoryMaker createFactory(Mode type){
        switch (type) {
            case BEGINNER:
                return new BeginnerFactory();
            case INTERMEDIATE:
                return new IntermediateFactory();
            case ADVANCED:
                return new AdvancedFactory();
            default:
                Mode errMsg = type;
                throw new IllegalArgumentException(String.valueOf(errMsg));
        }
    }
}
