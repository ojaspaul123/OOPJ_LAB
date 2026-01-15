//:Write a class file – box with three data members(length, width,
//height) and a method volume() . Also implement the application class Demo
//where an object of the box class is created with user entered dimensions and
//volume is printed.

package DAY2;
import java.util.Scanner;
class rectangle{
    double l,b, area, peri;
    void read (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        l=sc.nextDouble();
        b=sc.nextDouble();
        sc.close();
    }
    void calculate() {
        area = l*b;
        peri = 2*(l+b);
    }
    void display(){
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + peri);
    }
}
public class Q6 {
    public static void main(String[] args){
        rectangle r = new rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}
