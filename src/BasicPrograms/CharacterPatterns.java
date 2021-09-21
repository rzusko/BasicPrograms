package BasicPrograms;

public class CharacterPatterns {

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
                System.out.print((char) (j + 65) + " ");
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
                System.out.print((char) (i + 65) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        rightTriangleAlphabeticPattern(5);
        repeatingAlphabetPattern(5);
    }
}
