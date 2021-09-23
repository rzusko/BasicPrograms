package NumberPrograms;

public class ReverseNumber {
    public static int reverseNumber(int numberToReverse) {
        int reversedNumber = 0;

        while (numberToReverse != 0) {
            int temp = numberToReverse % 10;
            numberToReverse /= 10;
            reversedNumber = (reversedNumber * 10) + temp;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
    }
}
