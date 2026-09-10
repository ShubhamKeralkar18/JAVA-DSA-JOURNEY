public class Day3Practice {
    public static void main(String[] args) {

        // Problem 1: Print numbers from 1 to 10 using for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // Problem 2: Print even numbers from 1 to 20

        System.out.println("Even numbers:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // Problem 3: Print numbers from 10 to 1 using while loop

        System.out.println("Reverse:");

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }


        // Problem 4: Find sum of numbers from 1 to 10

        int sum = 0;

        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }

        System.out.println("Sum = " + sum);


        // Problem 5: Multiplication table

        int number = 7;

        System.out.println("Table of " + number);

        for (int j = 1; j <= 10; j++) {
            System.out.println(number + " x " + j + " = " + (number * j));
        }


        // Problem 6: Count from 1 to 5 using while loop

        System.out.println("While loop:");

        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}