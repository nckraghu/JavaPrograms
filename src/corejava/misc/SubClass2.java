package corejava.misc;

import corejava.inheritance.SuperClass;

/**
 * Created by Gowtham on 03-11-2017.
 */
// This class extends SuperClass from inheritance package.
@SuppressWarnings({"WeakerAccess", "unused"})
public class SubClass2 extends SuperClass {

    // This declaration will hide the SuperClass's field. (Not recommended)
    public static String publicStaticVarInSuperClass = "publicStaticVarInSubClass2";
    public static String publicVarInSuperClass = "publicSVarInSubClass2";

    // This declaration will hide method from SuperClass
    public static void publicStaticMethodInSuperClass() {
        System.out.println("publicStaticMethod in SubClass2");
    }

    // This declaration will override method from SuperClass
    @Override
    public void publicMethodInSuperClass() {
        System.out.println("publicMethod in SubClass2");
    }

    public void canAccessSuper() {

        // Fields
        System.out.println(publicStaticVarInSuperClass);
        System.out.println(protectedStaticVarInSuperClass);

        System.out.println(publicVarInSuperClass);
        System.out.println(protectedVarInSuperClass);

        // Methods
        publicStaticMethodInSuperClass();
        protectedStaticMethodInSuperClass();

        publicMethodInSuperClass();
        protectedMethodInSuperClass();

    }
}
