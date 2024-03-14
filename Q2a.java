import java.util.Scanner;

public class Q2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        }

}
