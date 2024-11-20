import java.util.Scanner;

public class Tasksheet119 {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        // Perform arithmetic operations and store results
        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        int quotient = divide(num1, num2);

        // Print the results
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);

        s.close();
        }
        
}
