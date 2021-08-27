package BasicPrograms;

/*
    In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    The first two numbers of fibonacci series are 0 and 1.
 */

import java.util.Scanner;

public class Fibonacci {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the count of numbers of fibonacci series you want to show: ");
        int count = scanner.nextInt();
        scanner.close();

        printFibonacci(count);
    }

    /**
     * This method prints Fibonacci series of entered length.
     * @param count - lenght of Fibonacci series
     */
    public static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            printFibonacci(count - 1);
        }
    }
}
