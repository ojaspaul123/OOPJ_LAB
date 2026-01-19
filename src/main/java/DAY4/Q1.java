//-Illustrate the usage of abstract class with following Java classes –
// An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
//method course()
// A subclass ‘kiitian’ with course() method implementation
//Write the driver class to print the all details of a kiitian object.
package DAY4;
import java.util.Scanner;
abstract class Student {
    int rollno;
    int regno;

    void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();
        System.out.print("Enter Registration No: ");
        regno = sc.nextInt();
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course: B.Tech in Computer Science (KIIT University)");
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Registration No: " + regno);
        course();
    }
}
public class Q1 {
    public static void main(String[] args){
        Kiitian K1 = new Kiitian();
        System.out.println("---Details Of Student---");
        K1.getinput();
        K1.display();

    }

}
