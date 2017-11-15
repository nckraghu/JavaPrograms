package corejava.inheritance;

/**
 * Created by Gowtham on 03-11-2017.
 */
// This class extends SuperClass.
@SuppressWarnings({"WeakerAccess", "unused"})
public class SubClass1 extends SuperClass {

    // This declaration will hide the SuperClass's field, even if types are different. (Not recommended)
    public static String publicStaticVarInSuperClass = "publicStaticVarInSubClass1";
    public static String publicVarInSuperClass = "publicSVarInSubClass1";

    // This declaration will hide method from SuperClass
    public static void publicStaticMethodInSuperClass() {
        System.out.println("publicStaticMethod in SubClass1");
    }

    // This declaration will override method from SuperClass
    @Override
    public void publicMethodInSuperClass() {
        super.publicMethodInSuperClass();
        System.out.println("publicMethod in SubClass1");
    }

    public void canAccessSuper() {

        // Fields
        System.out.println(publicStaticVarInSuperClass);
        System.out.println(protectedStaticVarInSuperClass);
        System.out.println(packagePrivateStaticVarInSuperClass);

        System.out.println(publicVarInSuperClass);
        System.out.println(protectedVarInSuperClass);
        System.out.println(packagePrivateVarInSuperClass);

        // Methods
        publicStaticMethodInSuperClass();
        protectedStaticMethodInSuperClass();
        packagePrivateStaticMethodInSuperClass();

        publicMethodInSuperClass();
        protectedMethodInSuperClass();
        packagePrivateMethodInSuperClass();

    }
}
