package corejava.inheritance;

/**
 * Created by Gowtham on 04-11-2017.
 */
// A final class can be instantiated but cannot be extended.
// A final class may or may not have final methods.
// A class cannot be both abstract and final at the same time.

// A final method cannot be overridden.
// Methods called from constructors should be declared final, in general.
public final class FinalClass {

    void name() {
        System.out.println("Gowtham");
    }

    final int get() {
        return 1;
    }
}

// An abstract class cannot be instantiated but can be extended.
// An abstract class may or may not have abstract methods.
// If a class has an abstract method, it must be declared abstract.
// Subclasses of abstract classes usually implement all abstract methods. If not, they too must be declared abstract.

// An abstract class can implement an interface.
// Eg: AbstractMap<K,V> class provides a skeletal implementation of the Map<K,V> interface,
// to minimize the effort required to implement this interface.
abstract class AbstractClass {

    void name() {
        System.out.println("gowtham");
    }

    abstract int get();
}

/*
 abstract class vs interface
    abstract classes can have non public, static, final fields. Interfaces can only have public, static, final fields.
    abstract classes can have public, private and protected concrete methods. Interfaces' methods are always public.
    A class can extend only one abstract class, but can implement multiple interfaces.

 From Oracle tutorials
 Consider using abstract classes if any of these statements apply to your situation:
    You want to share code among several closely related classes.
    You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
    You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
 Consider using interfaces if any of these statements apply to your situation:
    You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
    You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
    You want to take advantage of multiple inheritance of type.
*/