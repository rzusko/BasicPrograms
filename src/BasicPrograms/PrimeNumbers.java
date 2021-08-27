package BasicPrograms;

/*
    Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
    In other words, prime numbers can't be divided by other numbers than itself or 1.
    For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */

public class PrimeNumbers {

    public static boolean isPrime(int number) {

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (number / 2); i++) {
                if ((number % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void printPrimes(int end) {
        printPrimes(0, end);
    }

    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            if (isPrime(i)) {
//                System.out.println(i + " is prime number");
//            } else {
//                System.out.println(i + " is not prime number");
//            }
//        }

        printPrimes(1000);
    }
}
