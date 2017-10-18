package classes;

/**
 * Created by Gowtham on 18-10-2017
 * An outer class with static and non-static (inner) nested classes
 */
@SuppressWarnings({"unused", "WeakerAccess", "FieldCanBeLocal"})
public class OuterClass {

    public static String outerPublicStaticVar = "outerPublicStaticVar";
    private static String outerPrivateStaticVar = "outerPrivateStaticVar";
    public String outerPublicVar = "outerPublicVar";
    private String outerPrivateVar = "outerPrivateVar";

    public OuterClass() {
        System.out.println("OuterClass object created.");
    }

    public static String outerPublicStaticMethod() {
        return "outerPublicStaticMethod";
    }

    private static String outerPrivateStaticMethod() {
        return "outerPrivateStaticMethod";
    }

    public static void accessStaticNestedClassMembersFromStaticMethod() {
        System.out.println(StaticNestedClass.staticNestedPublicStaticVar);
        System.out.println(StaticNestedClass.staticNestedPrivateStaticVar);
        System.out.println(new StaticNestedClass().staticNestedPublicVar);
        System.out.println(new StaticNestedClass().staticNestedPrivateVar);

        System.out.println(StaticNestedClass.staticNestedPublicStaticMethod());
        System.out.println(StaticNestedClass.staticNestedPrivateStaticMethod());
        System.out.println(new StaticNestedClass().staticNestedPublicMethod());
        System.out.println(new StaticNestedClass().staticNestedPrivateMethod());
    }

    public static void accessInnerClassMembersFromStaticMethod() {
        OuterClass.InnerClass innerClassObject = new OuterClass().new InnerClass();

        System.out.println(innerClassObject.innerPublicVar);
        System.out.println(innerClassObject.innerPrivateVar);

        System.out.println(innerClassObject.innerPublicMethod());
        System.out.println(innerClassObject.innerPrivateMethod());

    }

    public void accessStaticNestedClassMembersFromNonStaticMethod() {
        System.out.println(StaticNestedClass.staticNestedPublicStaticVar);
        System.out.println(StaticNestedClass.staticNestedPrivateStaticVar);
        System.out.println(new StaticNestedClass().staticNestedPublicVar);
        System.out.println(new StaticNestedClass().staticNestedPrivateVar);

        System.out.println(StaticNestedClass.staticNestedPublicStaticMethod());
        System.out.println(StaticNestedClass.staticNestedPrivateStaticMethod());
        System.out.println(new StaticNestedClass().staticNestedPublicMethod());
        System.out.println(new StaticNestedClass().staticNestedPrivateMethod());
    }

    public void accessInnerClassMembersFromNonStaticMethod() {
        OuterClass.InnerClass innerClassObject = new OuterClass().new InnerClass();

        System.out.println(innerClassObject.innerPublicVar);
        System.out.println(innerClassObject.innerPrivateVar);

        System.out.println(innerClassObject.innerPublicMethod());
        System.out.println(innerClassObject.innerPrivateMethod());
    }

    public String outerPublicMethod() {
        return "outerPublicMethod";
    }

    private String outerPrivateMethod() {
        return "outerPrivateMethod";
    }

    // Static Nested Class can be public or private.
    public static class StaticNestedClass {

        // Static Nested Class can define both static and non-static variables.
        public static String staticNestedPublicStaticVar = "staticNestedPublicStaticVar";
        private static String staticNestedPrivateStaticVar = "staticNestedPrivateStaticVar";
        public String staticNestedPublicVar = "staticNestedPublicVar";
        private String staticNestedPrivateVar = "staticNestedPrivateVar";

        // Static Nested Class can be instantiated.
        public StaticNestedClass() {
            System.out.println("StaticNestedClass object created.");
        }

        // Static Nested Class can define both static and non-static methods.
        public static String staticNestedPublicStaticMethod() {
            return "staticNestedPublicStaticMethod";
        }

        private static String staticNestedPrivateStaticMethod() {
            return "staticNestedPrivateStaticMethod";
        }

        // Static Nested Class can access public & private static variables and methods of Outer class.
        // It cannot access non-static variables and methods of Outer class.
        public static void outerAccessFromPublicStaticMethod() {
            System.out.println(outerPublicStaticVar);
            System.out.println(outerPrivateStaticVar);

            System.out.println(outerPublicStaticMethod());
            System.out.println(outerPrivateStaticMethod());
        }

        private static void outerAccessFromPrivateStaticMethod() {
            System.out.println(outerPublicStaticVar);
            System.out.println(outerPrivateStaticVar);

            System.out.println(outerPublicStaticMethod());
            System.out.println(outerPrivateStaticMethod());
        }

        public String staticNestedPublicMethod() {
            return "staticNestedPublicMethod";
        }

        private String staticNestedPrivateMethod() {
            return "staticNestedPrivateMethod";
        }

        // Static Nested Class can access public & private static variables and methods of Outer class.
        // It cannot access non-static variables and methods of Outer class.
        public void outerAccessFromPublicMethod() {
            System.out.println(outerPublicStaticVar);
            System.out.println(outerPrivateStaticVar);

            System.out.println(outerPublicStaticMethod());
            System.out.println(outerPrivateStaticMethod());
        }

        private void outerAccessFromPrivateMethod() {
            System.out.println(outerPublicStaticVar);
            System.out.println(outerPrivateStaticVar);

            System.out.println(outerPublicStaticMethod());
            System.out.println(outerPrivateStaticMethod());
        }
    }

    // Inner Class can be public or private.
    public class InnerClass {

        // Inner Class can define only non-static variables.
        public String innerPublicVar = "innerPublicVar";
        private String innerPrivateVar = "innerPrivateVar";

        // Inner Class can be instantiated.
        public InnerClass() {
            System.out.println("InnerClass object created.");
        }

        // Inner Class can define only non-static methods.
        public String innerPublicMethod() {
            return "innerPublicMethod";
        }

        private String innerPrivateMethod() {
            return "innerPrivateMethod";
        }

        // Inner Class can access public & private, static & non-static variables and methods of Outer class.
        public void outerAccessFromPublicMethod() {
            System.out.println(outerPublicStaticVar);
            System.out.println(outerPrivateStaticVar);
            System.out.println(outerPublicVar);
            System.out.println(outerPrivateVar);

            System.out.println(outerPublicStaticMethod());
            System.out.println(outerPrivateStaticMethod());
            System.out.println(outerPublicMethod());
            System.out.println(outerPrivateMethod());
        }

        private void outerAccessFromPrivateMethod() {
            System.out.println(outerPublicStaticVar);
            System.out.println(outerPrivateStaticVar);
            System.out.println(outerPublicVar);
            System.out.println(outerPrivateVar);

            System.out.println(outerPublicStaticMethod());
            System.out.println(outerPrivateStaticMethod());
            System.out.println(outerPublicMethod());
            System.out.println(outerPrivateMethod());
        }
    }

}
