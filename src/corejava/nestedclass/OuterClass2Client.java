package corejava.nestedclass;

/**
 * Created by Gowtham on 22-10-2017
 * A test client for OuterClass2
 */
public class OuterClass2Client {

    public static void main(String... args) {
        OuterClass2.outerPublicStaticMethod();

        OuterClass2 outerClass2Object = new OuterClass2();
        outerClass2Object.outerPublicMethod();
    }
}
