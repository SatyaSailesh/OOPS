import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid score! Must be between 0 and 100.");
        }
        this.name = name;
        this.score = score;
    }

    public String getGrade() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    public void displayStudent() {
        System.out.println("Student: " + name + " | Score: " + score + " | Grade: " + getGrade());
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student score (0-100): ");
            int score = scanner.nextInt();

            Student student = new Student(name, score);
            student.displayStudent();
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric score.");
        } finally {
            scanner.close();
            System.out.println("Program completed.");
        }
    }
}
