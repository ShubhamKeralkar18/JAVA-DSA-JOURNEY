public class Day5Practice {
    public static void main(String[] args) {

        // ==========================================
        // Pattern 1: Increasing Stars
        // ==========================================

        System.out.println("Pattern 1:");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ==========================================
        // Pattern 2: Decreasing Stars
        // ==========================================

        System.out.println();
        System.out.println("Pattern 2:");

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ==========================================
        // Pattern 3: Increasing Numbers
        // ==========================================

        System.out.println();
        System.out.println("Pattern 3:");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // ==========================================
        // Pattern 4: Same Number in Each Row
        // ==========================================

        System.out.println();
        System.out.println("Pattern 4:");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}