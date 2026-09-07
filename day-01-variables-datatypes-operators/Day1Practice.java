public class Day1Practice {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 12;
        
        // Print basic info 
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        
        // Math operators
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Remainder: " + (num1 % num2));
        
        // Even/Odd check using your own logic
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }
        
        // Comparison
        System.out.println("Is num1 greater than num2? " + (num1 > num2));
    }
}