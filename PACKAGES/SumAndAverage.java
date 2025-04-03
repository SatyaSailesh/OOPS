import java.util.ArrayList;
import java.util.List;
public class SumAndAverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0; 
        }
        return (double) calculateSum(numbers) / numbers.size();
    }
}
