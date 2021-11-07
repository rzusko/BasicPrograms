package NumberPrograms;

/*
    A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.

    Steps to Find Peterson Number:

    - Read or initialize a number (n).
    - Find the last digit (d) of the given number.
    - Find the factorial (fact) of the digit.
    - Add the factorial (fact) to a variable
    - Repeat steps 2 to 4 until the given number becomes 0.
    - Compare the sum with n. If both are equal, the given number is Peterson, else not.

    Example of Peterson Number:

    Suppose, we have to check the number (n) 145 is Peterson or not.

    Number = 145

    145 = !1 + !4 + !5

    =1+4*3*2*1+5*4*3*2*1

    =1+24+120

    145=145

    We observe that the number and the sum of factorials of digits are equal to the number itself. Hence, 145 is a Peterson number.
 */

import java.util.Scanner;

public class PetersonNumber {
    public static boolean isPeterson(int number) {
        int temp = number;
        int sumOfFactorials = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;      // find list digit of given number
            int fact = BasicPrograms.Factorial.factorial(lastDigit);    // find factorial of the lastDigit
            sumOfFactorials += fact;        // add factorial to sumOfFactorials variable
            temp /= 10;
        }

        if (sumOfFactorials == number) {
            return true;
        }

        return false;
    }

    public static boolean isPetersonAnotherWay(int number) {
        int[] listOfFactorials = {1,1,2,6,24,120,720,5040,40320,362880};

        int temp = number;
        int sumOfFactorials = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            int fact = listOfFactorials[lastDigit];
            sumOfFactorials += fact;
            temp /= 10;
        }

        if (sumOfFactorials == number) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number to find if it is Peterson number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        if (isPetersonAnotherWay(number)) {
            System.out.println("Given number is Peterson.");
        } else {
            System.out.println("Given number is not Peterson.");
        }
    }
}
