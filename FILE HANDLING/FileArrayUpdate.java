import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String fileName = "arraydata.txt";
        List<String> numbers = new ArrayList<>();

        try {
            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    numbers.add(line);
                }
                reader.close();
            }

            System.out.println("Current Array: " + numbers);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to append: ");
            String newNumber = scanner.nextLine();
            numbers.add(newNumber);
            
            PW writer = new PW(new FileWriter(file, false)); 
               for (int i = 0; i < numbers.size(); i++) {
                writer.println(numbers.get(i));
            }
            writer.close();

            System.out.println("Updated Array: " + numbers);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
