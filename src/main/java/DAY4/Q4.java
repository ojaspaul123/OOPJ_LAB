//Define an interface Emploee with a method getDetails() to get emplyee
//details as Empid and Ename. Also define a derived interface Manager with a method
//getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head
//which implements Manager interface and also prints all details of the employee. Write the complete
//program to display all details of one head of the department.

package DAY4;
import java.util.Scanner;
interface Employee{
    public void getDetails();
}
interface Manager extends Employee{
    public void getDeptDetails();
}
class Head implements Manager{
    int Emp_id,Dept_id;
    String Emp_name,Dept_name;
    Scanner sc = new Scanner(System.in);
    public void getDeptDetails() {
        System.out.println("Enter Department ID: ");
        Dept_id = sc.nextInt();
        System.out.println("Enter Department Name: ");
        Dept_name = sc.next();
    }
    public void getDetails() {
        System.out.println("Enter Employee ID: ");
        Emp_id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        Emp_name = sc.next();
    }
    void display(){
        System.out.println("Employee ID:"+Emp_id);
        System.out.println("Employee Name:"+Emp_name);
        System.out.println("Department ID:"+Dept_id);
        System.out.println("Department Name:"+Dept_name);
    }
}
public class Q4 {
    public static void main(String []args){
        Head H1 = new Head();
        H1.getDeptDetails();
        H1.getDetails();
        H1.display();
    }
}
