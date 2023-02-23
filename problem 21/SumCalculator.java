import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int num1 = 0, num2 = 0, sum;

        while (!validInput) {
            try {
                System.out.print("Enter first integer: ");
                num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter second integer: ");
                num2 = Integer.parseInt(scanner.nextLine());

                validInput = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter two integers.");
            }
        }

        sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

