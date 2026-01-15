//Accept 10 numbers from command line and check how many of them are
//even and how many are odd.

package DAY2;
import java.util.Scanner;
public class Q1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int counteven=0,countodd=0,num;
        System.out.println("Enter 10 Numbers: ");
        int i=0;
        for(i=0;i<10;i++){
            num = sc.nextInt();

            if (num % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }
        }
        System.out.println("Number of even numbers: "+counteven);
        System.out.println("Number of odd numbers: "+countodd);
        sc.close();
    }
}