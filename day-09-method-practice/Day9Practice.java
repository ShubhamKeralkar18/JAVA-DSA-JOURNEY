public class Day9Practice {

    // Q1: Find maximum of two numbers
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Q2: Check positive, negative or zero
    static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }

    // Q3: Find factorial
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Q4: Check prime number
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Q1: Maximum");
        System.out.println("Maximum = " + max(15, 25));

        System.out.println();

        System.out.println("Q2: Number Check");
        checkNumber(10);
        checkNumber(-5);
        checkNumber(0);

        System.out.println();

        System.out.println("Q3: Factorial");
        System.out.println("5! = " + factorial(5));

        System.out.println();

        System.out.println("Q4: Prime Check");
        System.out.println("7 is Prime: " + isPrime(7));
        System.out.println("10 is Prime: " + isPrime(10));
    }
}
