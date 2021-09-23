package BasicPrograms;

public class AsciiValue {
    public static void printAsciiValue(char ch) {
        System.out.println("ASCII value of " + ch + " is " + (int) ch);
    }

    public static void printAllAscii() {
        for (int i = 0; i <= 255; i++) {
            System.out.println("ASCII value of " + (char) i + " is " + i);
        }
    }

    public static void  printAsciiAZ() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println("ASCII value of " + ch + " is " + (int) ch);
        }
    }

    public static void  printAsciiAZCapital() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("ASCII value of " + ch + " is " + (int) ch);
        }
    }


    public static void main(String[] args) {
//        printAsciiValue('S');
//        printAllAscii();
        printAsciiAZ();
    }
}
