

//Write a class Account containing acc_no, balance as data members
//and two methods as input() for taking input from user and disp() method to display the details.
//Create a subclass Person which has name and aadhar_no as extra data members and
//override disp() function. Write the complete progrm to take and print details of three persons.
package DAY3;
import java.util.Scanner;
class Account {
    protected int acc_no;
    protected double balance;

    public void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}
class Person extends Account {
    private String name;
    private String aadhar_no;
    public void input(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.next();
        super.input(sc); // call Account input for acc_no and balance
    }
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp(); // call Account disp for acc_no and balance
        System.out.println("-----------------------------------");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }
        System.out.println("\n--- Details of Persons ---");
        for (int i = 0; i < 2; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i].disp();
        }
        sc.close();
    }
}