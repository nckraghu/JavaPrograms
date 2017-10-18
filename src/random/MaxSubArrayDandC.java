package random;

/**
 * Created by Gowtham on 25-01-2017
 */
public class MaxSubArrayDandC {

    private static int maxSubArray(int[] arr) {

        return maxSubArrayDandC(arr, 0, arr.length - 1);
    }

    private static int maxSubArrayDandC(int[] arr, int start, int end) {

        int lSum, rSum, cSum;

        if (start == end) {
            return arr[start];
        }

        int mid = (start + end) / 2;
        lSum = maxSubArrayDandC(arr, start, mid);
        rSum = maxSubArrayDandC(arr, mid + 1, end);
        cSum = maxSubArrayCrossover(arr, start, mid, end);

        if (lSum >= rSum && lSum >= cSum) {
            return lSum;
        } else if (rSum >= lSum && rSum >= cSum) {
            return rSum;
        } else {
            return cSum;
        }

    }

    private static int maxSubArrayCrossover(int[] arr, int start, int mid, int end) {
        int lSum = 0, rSum = 0;
        int maxLSum = Integer.MIN_VALUE;
        int maxRSum = Integer.MIN_VALUE;

        for (int i = mid; i >= start; i--) {
            lSum += arr[i];
            if (lSum > maxLSum) {
                maxLSum = lSum;
            }
        }

        for (int i = mid + 1; i <= end; i++) {
            rSum += arr[i];
            if (rSum > maxRSum) {
                maxRSum = rSum;
            }
        }

        return maxLSum + maxRSum;
    }

    public static void main(String... args) {

        int[] arr = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
//        int[] arr = {13, 3, 25, 20, 3, 16, 23, 18, 20, 7, 12, 5, 22, 15, 4, 7};
//        int[] arr = {-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7};

        long startTime = System.nanoTime();
        int maxSum = maxSubArray(arr);
        long endTime = System.nanoTime();

        System.out.println("Max Sum = " + maxSum);

        System.out.println((startTime));
        System.out.println((endTime));

    }
}
