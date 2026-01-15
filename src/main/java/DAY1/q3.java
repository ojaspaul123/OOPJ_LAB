//Write a program to print the week day for the given day no. of the
//current month using switch case statement

package DAY1;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number of the current month (1-31): ");
        int dayNo = sc.nextInt();
        int weekDay = dayNo % 7;

        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0: // when dayNo % 7 == 0
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        sc.close();
    }
}
