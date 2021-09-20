package BasicPrograms;

public class NumberPatterns {

    /*
        Output for size = 5:

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

     */
    public static void pattern1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

     */
    public static void pattern2(int size) {
        int k = 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 8:

                          1
                        1   1
                      1   2   1
                    1   3   3   1
                  1   4   6   4   1
                1   5  10  10   5   1
              1   6  15  20  15   6   1
            1   7  21  35  35  21   7   1

        !!! Works well only for numbers 1 - 13 !!!
        For higher number is necessary to update spacing.
     */
    public static void pattern3(int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%" + ((size - i) * 2) + "s", "");

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    /*
        Output for size = 4
             1
            212
           32123
          4321234
           32123
            212
             1

        !!! Works only for number 1 - 9 !!!
        For higher numbers is necessary to update spacing.
     */
    public static void pattern4(int size) {
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }

        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    /*
        Output for size = 5

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
     */
    public static void pattern5(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(13);
//        pattern4(4);
        pattern5(358);
    }
}
