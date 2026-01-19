// write a program in java which will ask the user how many toy details you want to accept
// then the program accept the toyId,toyName,ToyQuantity and toyPrice from the user
// Finally the program will display the individual details of all the toys and grant total of the billing amount.
package DAY4;
import java.util.Scanner;

class Toy {
    int tid;
    String toyname;
    int toyQuantity;
    double toyprice;

    Toy(int tid, String tname, int toyQuantity, double price) {
        this.tid = tid;
        this.toyname = tname;
        this.toyQuantity = toyQuantity;
        this.toyprice = price;
    }

    double totalPrice() {
        return toyprice * toyQuantity;
    }

    void display() {
        System.out.println("Toy ID: " + tid);
        System.out.println("Toy Name: " + toyname);
        System.out.println("Quantity: " + toyQuantity);
        System.out.println("Price per Toy: " + toyprice);
        System.out.println("Total Price: " + totalPrice());
        System.out.println("-----------------------------------");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of toys you want: ");
        int n = sc.nextInt();

        Toy[] toys = new Toy[n];
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Toy " + (i + 1));
            System.out.print("TOYID: ");
            int tid = sc.nextInt();
            System.out.print("TOYNAME: ");
            String toyname = sc.next();
            System.out.print("TOYQUANTITY: ");
            int toyQuantity = sc.nextInt();
            System.out.print("TOYPRICE: ");
            double toyprice = sc.nextDouble();

            toys[i] = new Toy(tid, toyname, toyQuantity, toyprice);
            grandTotal += toys[i].totalPrice();
        }


        System.out.println("\n----- Toy Details -----");
        for (Toy toy : toys) {
            toy.display();
        }

        System.out.println("Grand Total Billing Amount: " + grandTotal);

        sc.close();
    }
}




