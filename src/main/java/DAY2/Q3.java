//Write a program in java to input and display the details of n number
//of students having roll, name and cgpa as data members. Also display the name of the
//student having lowest cgpa.

package DAY2;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");

            System.out.print("Roll no: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        // Find student with lowest CGPA
        double minCgpa = students[0].cgpa;
        String minName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minName = students[i].name;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + minName + " (CGPA: " + minCgpa + ")");

        sc.close();
    }
}
