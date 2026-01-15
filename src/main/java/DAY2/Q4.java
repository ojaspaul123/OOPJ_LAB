//Write a program in Java to create a class Rectangle having data
//members length and breadth and three methods called read, calculate and display to read the
//values of length and breadth, calculate the area and perimeter of the rectangle and display the
//result respectively.

package DAY2;
import java.util.Scanner;
class Box {
    double l, w, h;
    double volume() {
        return l * w * h;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        System.out.print("Enter length: ");
        b.l = sc.nextDouble();
        System.out.print("Enter width: ");
        b.w = sc.nextDouble();
        System.out.print("Enter height: ");
        b.h = sc.nextDouble();
        System.out.println("Volume: " + b.volume());
    }
}