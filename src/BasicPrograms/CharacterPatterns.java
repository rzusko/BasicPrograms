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
    Output for size = 'E':

    A
    A B
    A B C
    A B C D
    A B C D E

    !!! Works only for characters 'A' - 'Z'
 */
    public static void rightTriangleAlphabeticPattern(char size) {
        for (char i = 'A'; i <= size; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
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
    Output for size = 'E':

    A
    B B
    C C C
    D D D D
    E E E E E
 */
    public static void repeatingAlphabetPattern(char size) {
        for (char i = 'A'; i <= size; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
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

    /*
    Output for size = 'E:

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
    public static void kShapeAlphabetPattern(char size) {
        for (char i = size; i > 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (char i = 'A'; i <= size; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

            A
           A B
          A B C
         A B C D
        A B C D E
     */
    public static void  triangleCharacterPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print((char) (k + ALPHA) + " ");
            }
            System.out.println();
        }
    }

    /*
    Output for size = 'E':

        A
       A B
      A B C
     A B C D
    A B C D E
 */
    public static void  triangleCharacterPattern(char size) {
        for (char i ='A'; i <= size; i++) {
            for (char j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (char k = 'A'; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = '5':

             A
            B B
           C   C
          D     D
         E       E
          D     D
           C   C
            B B
             A
     */
    public static void diamondCharacterPattern(int size) {
        for (int i = 0; i < size; i++) {
            diamondCharacterPatternPrint(i, size);
        }
        for (int i = (size - 2); i >= 0; i--) {
            diamondCharacterPatternPrint(i, size);
        }
    }

    private static void diamondCharacterPatternPrint(int i, int size) {
        for (int j = 1; j <= (size + i); j++) {
            if ((j == (size - i)) || (j == (size + i))) {
                System.out.print((char) (i + ALPHA));
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        rightTriangleAlphabeticPattern('E');
//        repeatingAlphabetPattern('E');
//        kShapeAlphabetPattern('E');
//        triangleCharacterPattern('E');
        diamondCharacterPattern(5);
    }

}
