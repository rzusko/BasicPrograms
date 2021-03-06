package BasicPrograms;

public class StarPatterns {

    /*
        Output for size = 5:

        *
        **
        ***
        ****
        *****

     */
    public static void rightTriangleStarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        *****
        ****
        ***
        **
        *

     */
    public static void mirroredRightTriangleStarPattern(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

            *
           **
          ***
         ****
        *****

     */
    public static void leftTriangleStarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        *****
         ****
          ***
           **
            *

     */
    public static void mirroredLeftTriangleStarPattern(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

            *
           * *
          * * *
         * * * *
        * * * * *

     */
    public static void pyramidStarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *

     */
    public static void diamondShapePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = (size - 1); i >= 1; i--) {
            for (int j = 1; j <= (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        *****
        ****
        ***
        **
        *

     */
    public static void downwardTriangleStarPattern(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        * * * * *
         * * * *
          * * *
           * *
            *

     */
    public static void reversePyramidStarPattern(int size) {
        for (int i =  size; i > 0; i--) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

     */
    public static void rightPascalsTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = (size - 1); i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

                *
              * *
            * * *
          * * * *
        * * * * *
          * * * *
            * * *
              * *
                *

     */
    public static void leftPascalsTriangle(int size) {
        for (int i = 1; i <= size ; i++) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = (size - 1); i > 0; i--) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * *

     */
    public static void sandglassStarPattern(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

             *
            * *
           *   *
          *     *
         *********

     */
    public static void triangleStarPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else if (i == (size - 1)) {
                for (int k = 0; k < ((2 * i) + 1);k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 0; k < ((2 * i) - 1); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Output for size = 5:

        *********
         *     *
          *   *
           * *
            *
     */
    public static void downTriangleStarPattern(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }

            if (i == size) {
                for (int k = 0; k < ((2 * i) - 1); k++) {
                    System.out.print("*");
                }
            } else if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int k = 0; k < ((2 * (i - 1)) - 1); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*
        Output for size = 5:

             *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *

     */
    public static void diamondStarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < (2 * i); k++) {
                if ((k == 1) || (k == ((2 * i) -1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = (size - 1); i > 0; i--) {
            for (int j = 1; j <= (size - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < (2 * i); k++) {
                if ((k == 1) || (k == ((2 * i) - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        rightTriangleStarPattern(5);
//        mirroredRightTriangleStarPattern(5);
//        leftTriangleStarPattern(5);
//        mirroredLeftTriangleStarPattern(5);
//        pyramidStarPattern(6);
//        diamondShapePattern(8);
//        downwardTriangleStarPattern(7);
//        reversePyramidStarPattern(8);
//        rightPascalsTriangle(8);
//        leftPascalsTriangle(8);
//        sandglassStarPattern(8);
//        triangleStarPattern(8);
//        downTriangleStarPattern(8);
        diamondStarPattern(5);
    }

}
