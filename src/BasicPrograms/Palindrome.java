package BasicPrograms;

/*
    Palindrome number in java: A palindrome number is a number that is same after reverse.
    For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
    It can also be a string like LOL, MADAM etc.

    Palindrome number algorithm:
    - Get the number to check for palindrome
    - Hold the number in temporary variable
    - Reverse the number
    - Compare the temporary number with reversed number
    - If both numbers are same, print "palindrome number"
    - Else print "not palindrome number"

 */

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String original) {

        if (original.equals(reverse(original))) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String original) {
        String reversed = "";

        for (int i = (original.length() - 1); i >= 0; i--) {
            reversed += original.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string or number you want to check: ");
        String original = scanner.nextLine();

        if (isPalindrome(original)) {
            System.out.println("Entered string or number is palindrome.");
        } else {
            System.out.println("Entered string or number is not palindrome.");
        }
    }
}
