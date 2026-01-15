//Write a program to print your name, roll no, section and branch in
//separate lines;
package DAY1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String roll_no;
        String sec;
        String branch;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your Roll_No: ");
        roll_no = scanner.nextLine();
        System.out.println("Enter your Section: ");
        sec= scanner.nextLine();
        System.out.println("Enter your Branch: ");
        branch = scanner.nextLine();

        System.out.println("Name - "+name);
        System.out.println("Roll No. - "+roll_no);
        System.out.println("Section - "+sec);
        System.out.println("Branch- "+branch);
        scanner.close();

    }
}
