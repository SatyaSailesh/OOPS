import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;         
            reverse = reverse * 10 + digit;   
            number = number / 10;            
        }

        return reverse; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call the reverseNumber() method
        int reversedNum = reverseNumber(num);

        t
        System.out.println("Reversed Number: " + reversedNum);

       }
}
