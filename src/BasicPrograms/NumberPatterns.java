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

    /*
        Output for size = 5

        5
        5 4
        5 4 3
        5 4 3 2
        5 4 3 2 1
     */
    public static void pattern6(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = size; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1

     */
    public static void pattern7(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        10101
        01010
        10101
        01010
        10101
     */
    public static void pattern8(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        1
        10
        101
        1010
        10101

     */
    public static void pattern9(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }

    /*
        Output for size 5:

        1 2 3 4 5
         2 3 4 5
          3 4 5
           4 5
            5
           4 5
          3 4 5
         2 3 4 5
        1 2 3 4 5
     */
    public static void pattern10(int size) {
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
     */
    public static void pattern11(int size) {
        for (int i = 1; i < size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5
     */
    public static void pattern12(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
     */
    public static void pattern13(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
     */
    public static void pattern14(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
     */
    public static void pattern15(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(13);
//        pattern4(4);
//        pattern5(358);
//        pattern6(325);
//        pattern7(5);
//        pattern8(8);
//        pattern9(9);
//        pattern10(10);
//        pattern11(5);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
        pattern15(5);
    }
}
