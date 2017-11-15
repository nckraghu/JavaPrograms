package corejava.inheritance;

/**
 * Created by Gowtham on 31-10-2017.
 */
// An interface can extend multiple other interfaces.
// Interface inheritance?
public interface RelatableExt extends Relatable {

    // Parent interface's CONSTANTS are inherited.
    // Child interface can redefine parent interface's constants.
//    String NAME = "Kalyan";
//    double PI = 3.14;

    // Parent interface's STATIC METHODS are not inherited.
    // Child interface can redefine parent interface's static methods.
    static void printName() {
        System.out.println("Name = " + NAME);
    }

    static double getPI() {
        return PI;
    }

    // Parent interface's ABSTRACT METHODS are inherited.
    // Child interface can override (what's the point?) parent interface's abstract methods.
    @Override
    void hello();

    @Override
    int isLargerThan(Relatable other);

    // Parent interface DEFAULT METHODS are inherited.
    // Child interface can override parent interface's default methods.
    @Override
    default int number() {
        return 2;
    }

}
