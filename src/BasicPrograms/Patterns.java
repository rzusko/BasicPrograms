package BasicPrograms;

public class Patterns {

    public static void rightTriangleStarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void mirroredRightTriangleStarPattern(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

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

    public static void downwardTriangleStarPattern(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

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

    public static void main(String[] args) {
//        rightTriangleStarPattern(5);
//        mirroredRightTriangleStarPattern(5);
//        leftTriangleStarPattern(5);
//        mirroredLeftTriangleStarPattern(5);
//        pyramidStarPattern(6);
//        diamondShapePattern(8);
//        downwardTriangleStarPattern(7);
        reversePyramidStarPattern(8);
    }

}
