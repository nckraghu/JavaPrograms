package corejava.inheritance;

/**
 * Created by Gowtham on 03-11-2017.
 */
// Demonstrates the use of super and sub classes' constructors.
// Uses super keyword.

// If the subclass constructor does not specify which superclass constructor to invoke
//   a) then the compiler will automatically call the ACCESSIBLE NO-ARGS CONSTRUCTOR in the superclass, through implicit super().
//   b) if there's no no-args constructor in the super class, or if it is not accessible, then the compiler will throw an error.

// Call to super() & this() must be the FIRST STATEMENT in a constructor.

// For every class without a constructor, the compiler will insert a default pubic no-args constructor.
// As soon as we specify a constructor with parameter(s), the compiler will no longer insert a default no-args constructor in the class.
public class Constructors {
    public static void main(String[] args) {

        // case 1: default constructor in B will call default constructor in A.
        // case 2: implicit/explicit super() in no-args/args constructor in B will call default/explicit no-args constructor in A.
        // case 3: explicit super(param list) in no-args/args constructor in B will call matching constructor in A.

        // Only B objects are created.
        // Even though A's constructors are called from within B's constructors, A's objects are not created.
        // "new" creates new objects, where as just calling a constructor will just initialize the object members.
        B b1 = new B();
        B b2 = new B(5);

        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}

class A {

    A() {
        System.out.println("no-args constructor in A called.");
    }

    A(int i) {
        System.out.println("args constructor in A called." + i);
    }

}

// super() calls in a subclass constructors does not lead to creation of new superclass objects.
// super() calls can only be made from within subclass constructors.
class B extends A {

    B() {
        System.out.println("no-args constructor in B called.");
        System.out.println();
    }

    B(int i) {
        super(i);
        System.out.println("args constructor in B called." + i);
        System.out.println();
    }
}
