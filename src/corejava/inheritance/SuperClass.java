package corejava.inheritance;

/**
 * Created by Gowtham on 03-11-2017.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class SuperClass {

    // public static & non-static, variables & methods are inherited by all sub classes. (Non sub classes can access)
    // protected static & non-static, variables & methods are inherited by all sub classes. (Non sub classes cannot access)
    // package private static & non-static, variables & methods are inherited only by sub classes in the same package.
    // private static & non-static, variables & methods are not inherited by sub classes.
    // Instance methods are inherited and can be OVERRIDDEN.
    // Static methods are inherited and can be HIDDEN.

    // The access specifier for an overriding method can allow MORE, BUT NOT LESS, access than the overridden method.
    // For example, a protected instance method in the superclass can be made public, but not private, in the subclass.

    // You will get a COMPILE-TIME ERROR if you attempt to change an instance method in the superclass
    // to a static method in the subclass, and vice versa.

    // In a subclass, you can OVERLOAD the methods inherited from the superclass.
    // Such overloaded methods NEITHER HIDE NOR OVERRIDE the superclass instance methods—they are new methods,
    // unique to the subclass.

    public static String publicStaticVarInSuperClass = "publicStaticVarInSuperClass";
    protected static String protectedStaticVarInSuperClass = "protectedStaticVarInSuperClass";
    static String packagePrivateStaticVarInSuperClass = "packagePrivateStaticVarInSuperClass";
    private static String privateStaticVarInSuperClass = "privateStaticVarInSuperClass";

    public String publicVarInSuperClass = "publicVarInSuperClass";
    protected String protectedVarInSuperClass = "protectedVarInSuperClass";
    String packagePrivateVarInSuperClass = "packagePrivateVarInSuperClass";
    private String privateVarInSuperClass = "privateVarInSuperClass";


    public static void publicStaticMethodInSuperClass() {
        System.out.println("publicStaticMethod in SuperClass");
    }

    public static void protectedStaticMethodInSuperClass() {
        System.out.println("protectedStaticMethod in SuperClass");
    }

    static void packagePrivateStaticMethodInSuperClass() {
        System.out.println("packagePrivateStaticMethod in SuperClass");
    }

    private static void privateStaticMethodInSuperClass() {
        System.out.println("privateStaticMethod in SuperClass");
    }

    public void publicMethodInSuperClass() {
        System.out.println("publicMethod in SuperClass");
    }

    protected void protectedMethodInSuperClass() {
        System.out.println("protectedMethod in SuperClass");
    }

    void packagePrivateMethodInSuperClass() {
        System.out.println("packagePrivateMethod in SuperClass");
    }

    private void privateMethodInSuperClass() {
        System.out.println("privateMethod in SuperClass");
    }

}
