package BasicPrograms;

/*
    Factorial of n is the product of all positive descending integers.
    Factorial of n is denoted by n!. For example:
        4! = 4*3*2*1 = 24
        5! = 5*4*3*2*1 = 120

    Here, 4! is pronounced as "4 factorial", it is also called "4 bang" or "4 shriek".
    The factorial is normally used in Combinations and Permutations (mathematics).
 */

import java.util.Scanner;

public class Factorial {

    /**
     * This method calculates factorial using loop.
     * @param n
     * @return - factorial of entered number. If entered number is less than 1, then returns -1.
     */
    public static int factorial(int n) {
        int factor;

        if (n >= 0) {
            factor = 1;

            for (int i = 1; i <= n; i++) {
                factor *= i;
            }
        } else {
            factor = -1;
        }

        return factor;
    }

    /**
     * This method calculates factorial using recursion.
     * @param n
     * @return - factorial of entered number. If entered number is less than, then returns -1.
     */
    public static int factorialWithRecursion(int n) {

        if (n >= 1) {
            return n * factorialWithRecursion(n-1);
        } else if (n == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to calculate factorial: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(n + "! = " + factorial(n));
        System.out.println(n + "! = " + factorialWithRecursion(n));
    }

}
