//Illustrate the execution of constructors in multi-level inheritance with three
//Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
//where box inherits from plate and woodbox inherits from box class. Each class has constructor where
//dimensions are taken from user.

package DAY3;
import java.util.Scanner;
class Plate {
    protected double length, width;
    Plate(double l, double w) {
        length = l; width = w;
        System.out.println("Plate constructor executed.");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    protected double height;
    Box(double l, double w, double h) {
        super(l, w); // call Plate constructor
        height = h;
        System.out.println("Box constructor executed.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}
class WoodBox extends Box {
    private double thickness;
    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thickness = t; System.out.println("WoodBox constructor executed.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thickness);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, height, and thickness:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble(); // Creating WoodBox object triggers constructor chain
        WoodBox wb = new WoodBox(l, w, h, t);
        sc.close();
    }

}
