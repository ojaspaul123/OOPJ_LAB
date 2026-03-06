//-Write a java program that displays the number of characters, no. of
//lines and no. of words present in a text file whose name is given by the user.
package DAY7;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input file name
            System.out.print("Enter the file name: ");
            String filename = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(filename));

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (including spaces)
                charCount += line.length();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("No. of characters - " + charCount);
            System.out.println("No. of lines - " + lineCount);
            System.out.println("No. of words - " + wordCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

