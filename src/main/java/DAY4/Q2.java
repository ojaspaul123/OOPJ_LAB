
// write a java program of  two strings and two sub strings
// check the first sub string in first string  and second substring in second string or not
// if is present then concat the two substring .
package DAY4;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String: ");
        String St1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        String St2 = sc.nextLine();

        System.out.println("Enter First SubString: ");
        String Sub1 = sc.nextLine();
        System.out.println("Enter Second SubString: ");
        String Sub2 = sc.nextLine();

        if (St1.contains(Sub1) || St2.contains(Sub2)) {
            System.out.println("substring found in main-string");
            System.out.println("STRING1:" + Sub1 +" "+ Sub2);

//              if (St2.contains(Sub2)) {
//                  System.out.println("Second substring found in Second-string");
//                  //System.out.println("STRING1:"+Sub1+Sub2);
//              }
        } else {
            System.out.println("substring not found in main-string");
        }
        sc.close();
    }
}
