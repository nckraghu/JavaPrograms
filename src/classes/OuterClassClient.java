package classes;

/**
 * Created by Gowtham on 18-10-2017
 * A test client for testing Outer and Inner & Nested classes
 */
public class OuterClassClient {

    public static void main(String... args) {

        // Accessing Static nested class's public static variable & method
        // Can't access private static variable & method here
        System.out.println(OuterClass.StaticNestedClass.staticNestedPublicStaticVar);
        System.out.println(OuterClass.StaticNestedClass.staticNestedPublicStaticMethod());
        OuterClass.StaticNestedClass.outerAccessFromPublicStaticMethod();
        System.out.println();

        // Accessing Static nested class's public variable & method
        // Can't access private variable & method here
        OuterClass.StaticNestedClass staticNestedClassObject = new OuterClass.StaticNestedClass();
        System.out.println(staticNestedClassObject.staticNestedPublicVar);
        System.out.println(staticNestedClassObject.staticNestedPublicMethod());
        staticNestedClassObject.outerAccessFromPublicMethod();
        System.out.println();

        OuterClass outerClassObject = new OuterClass();
        OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass();

        // Accessing Inner class's public variable & method
        // Can't access private variable & method here
        System.out.println(innerClassObject.innerPublicVar);
        System.out.println(innerClassObject.innerPublicMethod());
        innerClassObject.outerAccessFromPublicMethod();

        System.out.println();

        // Outer class can access Static Nested Class's public & private, static & non-static variables & methods
        // from a static method
        OuterClass.accessStaticNestedClassMembersFromStaticMethod();
        System.out.println();
        // Outer class can access Static Nested Class's public & private, static & non-static variables & methods
        // from a non-static method
        outerClassObject.accessStaticNestedClassMembersFromNonStaticMethod();
        System.out.println();

        // Outer class can access Inner Class's public & private, static & non-static variables & methods
        // from a static method
        OuterClass.accessInnerClassMembersFromStaticMethod();
        System.out.println();
        // Outer class can access Inner Class's public & private, static & non-static variables & methods
        // from a non-static method
        outerClassObject.accessInnerClassMembersFromNonStaticMethod();
        System.out.println();
    }
}
