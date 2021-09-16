package BasicPrograms;

public class NumberPatterns {
    public static void pattern1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(7);
    }
}
