//Create an user defined exception named CheckArgument to check
//the number of arguments passed through command line. If the number of arguments is
//less than four then throw the Check Argument exception, else print the addition of squares
//of all the four elements.
package DAY6;
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}
public class Q5 {
    public static void main(String[] args) {
        try {
            // Check if arguments are less than 4
            if (args.length < 4) {
                throw new CheckArgument("Number of arguments is less than 4");
            } else {
                // Parse arguments and calculate sum of squares
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    int num = Integer.parseInt(args[i]);
                    sum += num * num;
                }
                System.out.println("Output : " + sum);
            }
        } catch (CheckArgument e) {
            System.out.println("Exception occurred - CheckArgument");
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred - Invalid number format");
        }
    }
}

