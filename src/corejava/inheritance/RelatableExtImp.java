package corejava.inheritance;

/**
 * Created by Gowtham on 31-10-2017.
 */
public class RelatableExtImp implements RelatableExt {

    @Override
    public void hello() {
        System.out.println("RelatableExtImp");
    }

    @Override
    public int isLargerThan(Relatable other) {
        return 0;
    }
}
