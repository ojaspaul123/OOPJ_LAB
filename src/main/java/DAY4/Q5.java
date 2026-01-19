//-Define an interface with three methods – earnings(), deductions() and bonus()
//and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
//Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
//bonus() method. Write the complete program to find out earnings, deduction and bonus of a
//sbstaff with basic salary amount entered by the user as per the following guidelines –
package DAY4;
import java.util.Scanner;


interface Salary {
    void earnings(double basic);
    void deductions(double basic);
    void bonus(double basic);
}


abstract class Manager1 implements Salary {
    @Override
    public void earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings: " + totalEarnings);
    }

    @Override
    public void deductions(double basic) {
        double deduction = 0.12 * basic;
        System.out.println("Deductions: " + deduction);
    }


}

class Substaff extends Manager1 {
    @Override
    public void bonus(double basic) {
        double bonus = 0.50 * basic; // 10% of basic
        System.out.println("Bonus: " + bonus);
    }
}


public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Substaff staff = new Substaff();

        staff.earnings(basic);
        staff.deductions(basic);
        staff.bonus(basic);

        sc.close();
    }
}


