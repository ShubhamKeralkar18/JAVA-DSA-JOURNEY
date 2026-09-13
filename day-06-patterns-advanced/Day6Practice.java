public class Day6Practice {
    public static void main(String[] args) {

        // ==========================================
        // Pattern 1: Right Triangle
        // ==========================================

        System.out.println("Pattern 1:");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ==========================================
        // Pattern 2: Right-Aligned Triangle
        // ==========================================

        System.out.println();
        System.out.println("Pattern 2:");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ==========================================
        // Pattern 3: Pyramid
        // ==========================================

        System.out.println();
        System.out.println("Pattern 3:");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ==========================================
        // Pattern 4: Inverted Pyramid
        // ==========================================

        System.out.println();
        System.out.println("Pattern 4:");

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}