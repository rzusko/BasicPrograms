package NumberPrograms;

public class ReverseNumber {
    public static int reverseNumber(int numberToReverse) {
        int reversedNumber = 0;

        while (numberToReverse != 0) {
            int remainder = numberToReverse % 10;
            numberToReverse /= 10;
            reversedNumber = (reversedNumber * 10) + remainder;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
    }
}
