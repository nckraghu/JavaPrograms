package corejava.nestedclass;

/**
 * Created by Gowtham on 22-10-2017
 * A test client for OuterClass3
 */
public class OuterClass3Client {

    public static void main(String... args) {
        OuterClass3.greet();

        OuterClass3 outerClass3Object = new OuterClass3();
        outerClass3Object.greetName();
    }
}
