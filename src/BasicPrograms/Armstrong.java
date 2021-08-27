package BasicPrograms;

/*
    An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
    It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
    It is an OEIS sequence A005188. Let’s understand it through an example.

    Armstrong Number Example

        1: 1^1 = 1
        2: 2^1 = 2
        3: 3^1 = 3
        153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
        1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643

    Similarly, we can check other number also.

    The first few Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407.
    Some other Armstrong numbers are 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817,
    9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774, 32164049650,
    32164049651.
 */

import java.util.Scanner;

public class Armstrong {

    /**
     * This method checks if entered number is Armstrong number.
     * @param input - number to check
     * @return - true if entered number is Armstrong number or false if is not Armstrong number.
     */
    public static boolean isArmstrong(int input) {
        if (input > 0) {
            int sum = 0;        // sum of the mth powers of digits of input
            int temp = input;   // temporary
            int digit = 0;      // number of digits of input

            // find number of digits of input
            while (temp > 0) {
                digit++;
                temp /= 10;
            }

            // find sum of the mth powers of digits of input
            temp = input;

            while (temp > 0) {
                sum = sum + (int) Math.pow((temp % 10), digit);
                temp /= 10;
            }

            // return true if sum and input are equal or false if they are not
            return (sum == input);
        }

        return false;   // number is not positive.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to check if it is Armstrong number: ");
        int input = scanner.nextInt();
        scanner.close();

        if (isArmstrong(input)) {
            System.out.println(input + " is Armstrong number.");
        } else {
            System.out.println(input + " is not Armstrong number.");
        }
    }
}
