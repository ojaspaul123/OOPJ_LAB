//-Define an interface Motor with a data member –capacity and two methods
//such as run() and consume(). Define a Java class ‘Washing machine’ which implements this
//interface and write the code to check the value of the interface data member thru an object of the
//class.

package DAY4;
interface motor{
    void run();
    void consume();
}
class washing_machine implements motor{
public void run(){
    System.out.println("the Washing machine is running...");
}
public void consume(){
    System.out.println("the Washing machine is consuming power...");
}
}
public class Q6 {
public static void main(String[] args){
washing_machine wm = new washing_machine();

wm.run();
wm.consume();
}
}
