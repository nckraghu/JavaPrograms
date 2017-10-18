package random;

public class MaxSubArray {

    public static void main(String... args) {

        int[] arr = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
//        int[] arr = {13, 3, 25, 20, 3, 16, 23, 18, 20, 7, 12, 5, 22, 15, 4, 7};
//        int[] arr = {-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7};
//        int[] arr = {10, 1, -2, -3, -4, -5};
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                    start = i;
                    end = j;
                }

            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Max sum = " + maxSum + " with indices between " + (start) + " and " + (end));

        System.out.println((startTime));
        System.out.println((endTime));

    }
}
