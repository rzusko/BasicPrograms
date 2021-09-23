package NumberPrograms;

/*
    This program converts given number into words.
    For example:
    12345 => twelve thousand three hundred forty five.
 */

import java.util.ArrayList;
import java.util.List;

public class NumberToWords {
    private final static String[] NUMBER_NAMES = {"","one","two","three","four","five", "six","seven","eight","nine"};
    private final static String[] TEEN_NAMES = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private final static String[] TENTH_NAMES = {"","","twenty", "thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    private final static String[] POWERS_OF_THOUSANDS = {"","thousand","million","billion","trillion","quadrillion","quintillion"};

    public static String numberToWords(long number) {
        String numberInWords = "";
        List<Integer> thousands = new ArrayList<Integer>();

        if (number == 0) {
            return "zero";
        }

        while (number != 0) {
            thousands.add((int) (number % 1000));
            number /= 1000;
        }

        for (int i = 0; i < thousands.size(); i++) {
            numberInWords = threeDigitsToWords(thousands.get(i)) + " " + POWERS_OF_THOUSANDS[i] + " " + numberInWords;
        }

        return numberInWords;
    }

    private static String threeDigitsToWords(int number) {
        String numberInWords = "";

        if (number == 0) {
            return "zero";
        }

        if (number >= 100) {
            numberInWords += NUMBER_NAMES[number / 100] + " hundred ";
            number %= 100;
        }

        if (number >= 20) {
            numberInWords += TENTH_NAMES[number / 10];
            number %= 10;
            if (number != 0) {
                numberInWords += "-" + NUMBER_NAMES[number];
            }
        } else if (number >= 10) {
            numberInWords += TEEN_NAMES[number % 10];
        } else {
            numberInWords += NUMBER_NAMES[number];
        }

        return numberInWords;
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(5666547611683230125L));
    }
}