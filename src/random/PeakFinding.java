package random;

/**
 * Created by Gowtham on 15-03-2017
 */
public class PeakFinding {

    private static int findPeak(int[] A) {
        int i = 0;
        while (i < A.length - 1 && A[i] < A[i + 1]) {
            i++;
        }

        return i;
    }

    public static void main(String... args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int peakIndex = findPeak(A);

        System.out.println("A peak is at " + peakIndex);
    }
}
