//A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
//box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
//it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
//from 2D.

package DAY3;
import java.util.Scanner;
public class Q1 {
    static double TwoDim(double length,double breadth){
        double volume = length * breadth;
        return volume * 40;
    }

    static double ThreeDim(double length,double breadth,double height){
        double volume = length * breadth * height;
        return volume * 60;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("2D Dimensions ");
        double l,b;
        System.out.println("Enter Length: ");
        l = sc.nextDouble();
        System.out.println("Enter Breadth: ");
        b = sc.nextDouble();
        double cal = TwoDim(l,b);
        System.out.println("Cost of Sheet = Rs " + cal +"/ per sq.ft");

        System.out.println("3D Dimensions ");
        double l1,b1,h1;
        System.out.println("Enter Length: ");
        l1 = sc.nextDouble();
        System.out.println("Enter Breadth: ");
        b1 = sc.nextDouble();
        System.out.println("Enter Height: ");
        h1 = sc.nextDouble();
        double cal1 = ThreeDim(l1,b1,h1);
        System.out.println("Cost of Sheet = Rs " + cal1+ "/ per cub.ft");

        sc.close();

    }
}