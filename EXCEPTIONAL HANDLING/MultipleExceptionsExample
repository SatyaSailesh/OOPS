import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();

            int result = num / divisor;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter a valid integer!");
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero!");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}
