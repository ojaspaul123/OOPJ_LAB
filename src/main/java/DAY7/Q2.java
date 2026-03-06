//Write a program in Java to copy the content of a given file to another
//user entered file using character stream (using File Reader and FileWriter Classes) and
//byte Stream (using FileInputStream and FileOutputStream Class).
package DAY7;

import java.io.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input source and destination file names
            System.out.print("Enter the source file name: ");
            String source = sc.nextLine();

            System.out.print("Enter the destination file name: ");
            String dest = sc.nextLine();

            // -------- CHARACTER STREAM COPY --------
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(dest);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using Character Stream.");

            // -------- BYTE STREAM COPY --------
            System.out.print("\nEnter another destination file for Byte Stream copy: ");
            String dest2 = sc.nextLine();

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest2);

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("File copied using Byte Stream.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

