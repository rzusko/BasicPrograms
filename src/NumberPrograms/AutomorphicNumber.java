package NumberPrograms;

/*
    A number is called an automorphic number if and only if the square of the given number ends with the same number itself.
    For example, 25, 76 are automorphic numbers because their square is 625 and 5776,
    respectively and the last two digits of the square represent the number itself.
    Some other automorphic numbers are 5, 6, 36, 890625, etc.
 */


import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;
        int digitCount = 0;

        while ((temp % 10) != 0) {
            digitCount++;
            temp /= 10;
        }

        if ((square % (int) Math.pow(10, digitCount)) == number) {
            return true;
        }

        return false;
    }

    public static void findAutomorphic(int start, int end) {
        System.out.print("Automorphic numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter number: ");
//        int numberToCheck = scanner.nextInt();
//        scanner.nextLine();

//        System.out.println("Entered number is automorphic: " + isAutomorphic(numberToCheck));

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();
        scanner.nextLine();

        findAutomorphic(start, end);
        scanner.close();
    }
}
