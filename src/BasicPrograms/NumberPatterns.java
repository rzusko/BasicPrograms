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

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
        pattern3(8);
    }
}
