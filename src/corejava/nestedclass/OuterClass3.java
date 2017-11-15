package corejava.nestedclass;

interface HelloWorld {
    void greet();
}

/**
 * Created by Gowtham on 22-10-2017
 * A class with an anonymous class
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class OuterClass3 {

    public static String outerPublicStaticVar = "outerPublicStaticVar";
    private static String outerPrivateStaticVar = "outerPrivateStaticVar";
    public String outerPublicVar = "outerPublicVar";
    private String outerPrivateVar = "outerPrivateVar";

    // Cannot access any of the anonymous class's members from enclosing class

    public OuterClass3() {
        System.out.println("OuterClass object created.");
    }

    public static void greet() {
        Hello helloObject = new Hello() {
            String name = "Gowtham";

            @Override
            public void greet() {
                System.out.println("Hello " + name);
                System.out.println(outerPublicStaticVar);
                System.out.println(outerPrivateStaticVar);
                System.out.println(new OuterClass3().outerPublicVar);
                System.out.println(new OuterClass3().outerPrivateVar);
            }
        };
        helloObject.greet();

        HelloWorld helloWorldObject = new HelloWorld() {
            String name = "Kalyan";

            @Override
            public void greet() {
                System.out.println("Hello " + name);
                System.out.println(outerPublicStaticVar);
                System.out.println(outerPrivateStaticVar);
                System.out.println(new OuterClass3().outerPublicVar);
                System.out.println(new OuterClass3().outerPrivateVar);
            }
        };
        helloWorldObject.greet();
    }

    public void greetName() {
        Hello helloObject = new Hello() {
            String name = "Gowtham";

            @Override
            public void greet() {
                System.out.println("Hello " + name);
                System.out.println(outerPublicStaticVar);
                System.out.println(outerPrivateStaticVar);
                System.out.println(outerPublicVar);
                System.out.println(outerPrivateVar);
            }
        };
        helloObject.greet();

        HelloWorld helloWorldObject = new HelloWorld() {
            String name = "Kalyan";

            @Override
            public void greet() {
                System.out.println("Hello " + name);
                System.out.println(outerPublicStaticVar);
                System.out.println(outerPrivateStaticVar);
                System.out.println(outerPublicVar);
                System.out.println(outerPrivateVar);
            }
        };
        helloWorldObject.greet();
    }

}

class Hello {

    public void greet() {
        System.out.println("Hello World!");
    }
}
