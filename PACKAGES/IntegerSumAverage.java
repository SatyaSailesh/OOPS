import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerSumAverage {
    public static void main(String[] args) {
        String inputFilePath = "numbers.txt";
        String outputFilePath = "results.txt";
        List<Integer> numbers = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; 
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = numbers.isEmpty() ? 0 : (double) sum / numbers.size();
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            String results = "Sum: " + sum + "\nAverage: " + average + "\n";
            fos.write(results.getBytes());
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        System.out.println("Results written to " + outputFilePath);
    }
}
