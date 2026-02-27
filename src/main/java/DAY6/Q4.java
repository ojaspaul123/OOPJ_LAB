//Write a program to create user defined exceptions called
//HrsException, MinException and SecException. Create a class Time which contains data
//members hours, minutes, seconds and a method to take a time from user which throws
//the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).
package DAY6;

import java.util.Scanner;

// Custom exception classes
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours, minutes, seconds;

    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 || h > 24) {
            throw new HrsException("hour is not greater than 24");
        }
        if (m < 0 || m > 60) {
            throw new MinException("minute is not greater than 60");
        }
        if (s < 0 || s > 60) {
            throw new SecException("second is not greater than 60");
        }

        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public void displayTime() {
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        try {
            t.setTime(h, m, s);
            t.displayTime();
        } catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidHourException: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidMinuteException: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidSecondException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

