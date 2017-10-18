package random;

/**
 * Created by Gowtham on 26-02-2017
 */
public class Test {

    public static void main(String... args) {

        boolean a[] = new boolean[10];
        int b[] = {5, 3, 7, 9, 1, 2, 6, 3, 9, 0};
        int x = 0;
        boolean checked = false;
        int count = 0;

        while (!checked) {
            int index = (int) ((Math.random() * 10));
            if (b[index] == x) {
                System.out.println("Found x = " + x + " at index = " + index);
//                checked = true;
                break;
            } else {
                count++;
                System.out.println("Did not find x = " + x + " at index = " + index);
            }

            a[index] = true;
            for (boolean anA : a) {
                if (!anA) {
                    checked = false;
                    break;
                } else {
                    checked = true;
                }
            }

        }

        System.out.println("Count = " + count);

    }
}
