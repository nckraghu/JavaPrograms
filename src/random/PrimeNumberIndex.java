package random;

/**
 * Created by Gowtham on 14-03-2017
 */
public class PrimeNumberIndex {

    private static int primeCounter = 0;
    private static int currentPrime = 3;

    private static void printPrimes(int x) {
        StringBuilder stringBuffer = new StringBuilder();

        while (stringBuffer.length() < 10005) {
            int nextPrime = generateNextPrime();
            stringBuffer.append(nextPrime);
        }

        System.out.println(stringBuffer.toString());

        String s = stringBuffer.toString();
        System.out.println("PrimeCounter = " + primeCounter);

        System.out.println(s.substring(x, x + 5));
    }

    private static int generateNextPrime() {
        if (primeCounter == 0) {
            primeCounter = 1;
            return 2;
        }
        if (primeCounter == 1) {
            primeCounter = 2;
            return 3;
        }

        currentPrime += 2;

        while (!isPrime(currentPrime)) {
            currentPrime += 2;
        }
        primeCounter++;
        return currentPrime;
    }

    private static boolean isPrime(int x) {
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String... args) {
        int x = 1000;
        printPrimes(x);
    }
}


