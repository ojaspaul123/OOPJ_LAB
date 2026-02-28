//Write a Java p rogram to handle an ArithmeticException using try,
//catch, and finally block.
package DAY6;
public class Q2 {
    public static void main(String[] args) {
        int num = 10;
        int demo = 0;

        try {
            int res = num / demo;
            System.out.println("Result: "+res);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }

    }
}
