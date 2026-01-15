//Write a program in Java to take first name and last name from user and
//print both in one line as last name followed by first name

package DAY1;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstletter,lastletter;
        System.out.println("Enter First name: ");
        firstletter=scanner.nextLine();
        System.out.println("Enter Second name: ");
        lastletter=scanner.nextLine();
        System.out.println(lastletter + " " +firstletter);


        scanner.close();
    }

}
