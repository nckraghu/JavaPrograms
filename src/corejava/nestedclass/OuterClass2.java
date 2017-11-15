package corejava.nestedclass;

/**
 * Created by Gowtham on 22-10-2017
 * A class with local inner class
 */
@SuppressWarnings({"unused", "UnusedAssignment", "WeakerAccess"})
public class OuterClass2 {

    public static String outerPublicStaticVar = "outerPublicStaticVar";
    private static String outerPrivateStaticVar = "outerPrivateStaticVar";
    public String outerPublicVar = "outerPublicVar";
    private String outerPrivateVar = "outerPrivateVar";

    public OuterClass2() {
        System.out.println("OuterClass object created.");
    }

    // Cannot access any of the local class's members from enclosing class

    public static void outerPublicStaticMethod() {
        String localVar = "localVar";
        localVar = "modifiedLocalVar";
        final String finalLocalVar = "finalLocalVar";

        class LocalClass {
            public static final String LOCAL_CLASS_PUBLIC_STATIC_FINAL_VAR = "LOCAL_CLASS_PUBLIC_STATIC_FINAL_VAR";
            private static final String LOCAL_CLASS_PRIVATE_STATIC_FINAL_VAR = "LOCAL_CLASS_PRIVATE_STATIC_FINAL_VAR";

            public String localClassPublicVar = "localClassPublicVar";
            private String localClassPrivateVar = "localClassPrivateVar";

            LocalClass() {
                System.out.println("LocalClass object created.");

                // Accessing outer class's variables, can access only static members directly
                System.out.println(outerPublicStaticVar);
                System.out.println(outerPrivateStaticVar);
                System.out.println(new OuterClass2().outerPublicVar);
                System.out.println(new OuterClass2().outerPrivateVar);

                // Accessing local variables, can't access non final local variables here
                System.out.println(LOCAL_CLASS_PUBLIC_STATIC_FINAL_VAR);
                System.out.println(LOCAL_CLASS_PRIVATE_STATIC_FINAL_VAR);
                System.out.println(localClassPublicVar);
                System.out.println(localClassPrivateVar);

                System.out.println(finalLocalVar);
            }
        }

        LocalClass localClassObject = new LocalClass();
    }

    public void outerPublicMethod() {
        String localVar = "localVar";
        localVar = "modifiedLocalVar";
        final String finalLocalVar = "finalLocalVar";

        class LocalClass {
            public static final String LOCAL_CLASS_PUBLIC_STATIC_FINAL_VAR = "LOCAL_CLASS_PUBLIC_STATIC_FINAL_VAR";
            private static final String LOCAL_CLASS_PRIVATE_STATIC_FINAL_VAR = "LOCAL_CLASS_PRIVATE_STATIC_FINAL_VAR";

            public String localClassPublicVar = "localClassPublicVar";
            private String localClassPrivateVar = "localClassPrivateVar";

            LocalClass() {
                System.out.println("LocalClass object created.");

                // Accessing outer class's variables, can access both static & non-static members directly
                System.out.println(outerPublicStaticVar);
                System.out.println(outerPrivateStaticVar);
                System.out.println(outerPublicVar);
                System.out.println(outerPrivateVar);

                // Accessing local variables, can't access non final local variables here
                System.out.println(LOCAL_CLASS_PUBLIC_STATIC_FINAL_VAR);
                System.out.println(LOCAL_CLASS_PRIVATE_STATIC_FINAL_VAR);
                System.out.println(localClassPublicVar);
                System.out.println(localClassPrivateVar);

                System.out.println(finalLocalVar);
            }
        }

        LocalClass localClassObject = new LocalClass();
    }


}
