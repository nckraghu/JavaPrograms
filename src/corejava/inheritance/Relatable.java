package corejava.inheritance;

/**
 * Created by Gowtham on 31-10-2017.
 */
// Interfaces are java types. Interfaces can define nested types, eg. enum.
// Interfaces can be public or package-private, implicitly abstract, cannot be final.
// Interfaces can "extend" multiple interfaces.
// Interfaces cannot be instantiated.
// Interface can be empty without any constants or methods. Example, Serializable interface.
// To modify a published interface, either extend the interface or add modification via new static/default methods.
public interface Relatable {

    // Interface fields are public static final, ie. CONSTANTS.
    // It cannot have protected, package-private or private fields.
    // It cannot have member fields (because interfaces cannot be instantiated)
    // or static fields (because interfaces' fields should not be modifiable).
    String NAME = "Gowtham";
    double PI = 3.14;

    // Interface methods  are public.
    // It cannot have protected, package-private or private methods.
    // It cannot have member methods (because interfaces cannot be instantiated)
    // but can have static methods.
    // Methods in interfaces are either Abstract, Static or Default methods.

    // STATIC METHODS, can be void or can return a value.
    // These methods are not overridden by implementing classes,
    // ie. implementing classes cannot call these methods.
    // Static methods are in general helper methods.
    static void printName() {
        System.out.println("Name = " + NAME);
    }

    static double getPI() {
        return PI;
    }

    // ABSTRACT METHODS, can be void or can return a value.
    // These methods must be overridden by implementing classes,
    // ie. implementing classes can call these methods.
    void hello();

    int isLargerThan(Relatable other);

    // DEFAULT METHODS
    // These methods can be (but not necessary) overridden by implementing classes,
    // ie. implementing classes cannot call these methods.
    // Default methods in general are used when extending interfaces.
    // Extending interfaces can inherit, make as abstract or override default methods.
    default void greet() {
        System.out.println("Greet");
    }

    default int number() {
        return 1;
    }

}
