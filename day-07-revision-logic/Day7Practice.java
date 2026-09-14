public class Day7Practice {

    public static void main(String[] args) {

        // ==========================================
        // Q1: Even Numbers
        // ==========================================

        System.out.println("Q1: Even Numbers");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();


        // ==========================================
        // Q2: Sum of Numbers
        // ==========================================

        System.out.println("Q2: Sum of Numbers");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
        System.out.println();


        // ==========================================
        // Q3: Multiplication Table
        // ==========================================

        System.out.println("Q3: Multiplication Table of 5");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println();


        // ==========================================
        // Q4: Star Triangle
        // ==========================================

        System.out.println("Q4: Star Triangle");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}