public class Day8Practice {

    // Method 1: Print Hello
    static void sayHello() {
        System.out.println("Hello, Java!");
    }

    // Method 2: Add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 3: Check even number
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 4: Find square
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        System.out.println("Q1: Say Hello");
        sayHello();

        System.out.println();

        System.out.println("Q2: Addition");
        int result = add(10, 20);
        System.out.println("10 + 20 = " + result);

        System.out.println();

        System.out.println("Q3: Even Check");
        System.out.println("8 is even: " + isEven(8));
        System.out.println("7 is even: " + isEven(7));

        System.out.println();

        System.out.println("Q4: Square");
        System.out.println("Square of 6 = " + square(6));
    }
}