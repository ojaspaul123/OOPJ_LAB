//-Write a java program to compare two binary files, printing the first
//byte position where they differ.
package DAY7;

import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        // Specify two existing binary files here
        String file1 = "fileA.bin";
        String file2 = "fileB.bin";

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int b1, b2;
            int position = 1;   // byte positions start from 1
            boolean areEqual = true;

            while (true) {
                b1 = fis1.read();
                b2 = fis2.read();

                // If both reach end of file
                if (b1 == -1 && b2 == -1) {
                    break;
                }

                // If bytes differ OR one file ends earlier
                if (b1 != b2) {
                    areEqual = false;
                    System.out.println("Two files are not equal: byte position at which they differ is " + position);
                    break;
                }

                position++;
            }

            fis1.close();
            fis2.close();

            if (areEqual) {
                System.out.println("Two files are equal");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

