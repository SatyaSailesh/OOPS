import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String fileName = "document.txt";
        int wordCount = 0, lineCount = 0, charCount = 0, sentenceCount = 0;
        String longestWord = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;

                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }

                sentenceCount += line.split("[.!?]").length;
            }

            System.out.println("\n====== File Analysis ======");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Total Sentences: " + sentenceCount);
            System.out.println("Longest Word: " + longestWord);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

