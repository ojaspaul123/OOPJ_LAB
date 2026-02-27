//Write a Java class which has a method called ProcessInput(). This
//method checks the number entered by the user. If the entered number is negative then
//throw an user defined exception called NegativeNumberException, otherwise it displays
//the double value of the entered number.
package DAY6;

import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q3 {
    public void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 demo = new Q3();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            demo.ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        } finally {
            sc.close();
        }
        sc.close();
    }
}

