//Write a program to print the corresponding grade for the given
//        mark using if..else statement in Java

package DAY1;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.println("enter the marks: ");
        marks = scanner.nextInt();
        if(marks>=91){
            System.out.println("GRADE : O");
        } else if (marks>=81) {
            System.out.println("GRADE : E");}
        else if (marks>=71) {
            System.out.println("GRADE : A");}
        else if (marks>=61) {
            System.out.println("GRADE : B");}
        else if (marks>=51) {
            System.out.println("GRADE : C");}
        else if (marks>=41) {
            System.out.println("GRADE : D");}
        else {
            System.out.println("GRADE: F");
        }
        scanner.close();
    }
}
