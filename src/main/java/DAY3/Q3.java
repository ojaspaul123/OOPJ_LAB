
//Write a program in Java having three classes Apple, Banana and
//Cherry. Class Banana and Cherry are inherited from class Apple and each class have their
//own member function show() . Using Dynamic Method Dispatch concept display all the show()
//method of each class.
package DAY3;
class Apple {
    void show() {
        System.out.println("Show method of Apple class");
    }
}
class Banana extends Apple {
    void show() {
        System.out.println("Show method of Banana class");
    }
}
class Cherry extends Apple {
    void show() {
        System.out.println("Show method of Cherry class");
    }
}

public class Q3 {
    public static void main(String[] args) { // Superclass reference
        Apple ref;
        ref = new Apple();
        ref.show();
        ref = new Banana();
        ref.show();
        ref = new Cherry();
        ref.show();
    }

}
