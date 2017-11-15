package corejava.inheritance;

/**
 * Created by Gowtham on 31-10-2017.
 */
public class RelatableClient {

    public static void main(String... args) {
        Rectangle rectangle1 = new Rectangle(10, 5);
        Relatable rectangle2 = new Rectangle(20, 15);

        // Both Rectangle & Relatable types can access CONSTANTS
        System.out.println(Rectangle.PI);
        System.out.println(Rectangle.NAME);
        System.out.println(Relatable.PI);
        System.out.println(Relatable.NAME);

        // Both Rectangle & Relatable types can call ABSTRACT METHODS (implemented in implementing class).
        // Both Rectangle & Relatable types can be passed to isLargerThan method.
        System.out.println(rectangle1.isLargerThan(rectangle2));
        rectangle1.hello();
        System.out.println(rectangle2.isLargerThan(rectangle1));
        rectangle2.hello();

        // Both Rectangle & Relatable types can access DEFAULT METHODS.
        System.out.println(rectangle1.number());
        rectangle1.greet();
        System.out.println(rectangle2.number());
        rectangle2.greet();

        // Only Relatable type can call STATIC METHODS.
        System.out.println(Relatable.getPI());
        Relatable.printName();

    }
}
