//Write a Java program to generate an
//ArrayIndexOutofBoundsException and handle it using catch statement.
package DAY6;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter the num of 5: ");
        try {
            for(int i =0;i<5;i++){
                arr[i] = sc.nextInt();

            }        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);

        }
        sc.close();
    }
}
