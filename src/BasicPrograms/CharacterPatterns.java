package BasicPrograms;

public class CharacterPatterns {
    private final static int ALPHA = 65;

    /*
        Output for size = 5:

        A
        A B
        A B C
        A B C D
        A B C D E
     */
    public static void rightTriangleAlphabeticPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + ALPHA) + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        A
        B B
        C C C
        D D D D
        E E E E E
     */
    public static void repeatingAlphabetPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + ALPHA) + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        A B C D E
        A B C D
        A B C
        A B
        A
        A B
        A B C
        A B C D
        A B C D E

     */
    public static void kShapeAlphabetPattern(int size) {
        for (int i = size; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + ALPHA) + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + ALPHA) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        rightTriangleAlphabeticPattern(5);
//        repeatingAlphabetPattern(5);
        kShapeAlphabetPattern(5);
    }

}
