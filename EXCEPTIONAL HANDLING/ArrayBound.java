import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Array elements: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();

            System.out.println("Element at index " + index + ": " + numbers[index]);

            int sum = calculateSum(numbers);
            System.out.println("Sum of array elements: " + sum);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds! Please enter a valid index (0-4).");
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter a number.");
        } finally {
            System.out.println("Execution completed!");
            scanner.close();
        }
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
