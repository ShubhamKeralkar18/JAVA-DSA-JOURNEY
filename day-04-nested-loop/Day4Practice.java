public class Day4Practice {
    public static void main(String[] args) {

        // Problem 1
        // Print 5 rows with 4 stars in each row

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // Problem 2
        // Print 12345 in 4 rows

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // Problem 3
        // Print increasing number pattern

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // Problem 4
        // Print decreasing number pattern

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}