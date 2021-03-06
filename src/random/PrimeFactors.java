package random;


/**
 * Created by Gowtham on 19-01-2017
 */
public class PrimeFactors {

    public static void main(String... args) {
        long number = 600851475143L;

        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {

            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        //Note that number cannot be 2 because we have removed all
        //2s in the first while loop.
        //Hence, number > 1 check is sufficient.
        //It arises when the original number itself is prime, or it has
        //one larger prime factor greater than sqrt(number). 
        if (number > 1) {
            System.out.println(number);
        }

    }
}
