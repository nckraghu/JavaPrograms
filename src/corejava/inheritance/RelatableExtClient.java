package corejava.inheritance;

/**
 * Created by Gowtham on 31-10-2017.
 */
public class RelatableExtClient {

    public static void main(String... args) {
        RelatableExtImp r1 = new RelatableExtImp();
        RelatableExt r2 = new RelatableExtImp();

        r1.hello();
        r1.isLargerThan(new Rectangle(5, 5));
        r1.greet();
        r1.number();

        r2.hello();
        r2.isLargerThan(new Rectangle(5, 5));
        r2.greet();
        r2.number();
    }
}
