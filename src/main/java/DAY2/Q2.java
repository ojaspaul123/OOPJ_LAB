//Program to find no. of objects created out of a class using ‘static’
//modifier.

package DAY2;
import java.util.Scanner;
class ObjectCounter {
    private static
    int count = 0;
    public ObjectCounter() {
        count++;
    }
    public static
    int getCount() {
        return count;
    }
}
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. fo objects :");
        n= sc.nextInt();
        for (int i = 0; i < n; i++) { new ObjectCounter(); }
        System.out.println("Number of objects created = " + ObjectCounter.getCount());
        sc.close();
    }
}