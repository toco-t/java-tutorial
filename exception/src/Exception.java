import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dividend = 5;
        int divisor;

        try {
            System.out.println("Enter a number to divide by: ");
            divisor = scan.nextInt();

            int result = dividend / divisor;
            System.out.printf("The result is %d", result);
        }
        catch(ArithmeticException e) {
            //System.out.println(e);
            System.out.println("YOU SHALL NOT DIVIDE BY ZERO");
        }
        catch(InputMismatchException e) {
            //System.out.println(e);
            System.out.println("...didn't I say a NUMBER?");
        }
        finally {
            scan.close();
        }
    }
}
