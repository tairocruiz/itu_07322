import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {       

        boolean validInput = false;
        int num1 = 0, num2 = 0, sum;
        Scanner cin = new Scanner(System.in);
        while (!validInput) {
            try {
                System.out.print("Enter first integer: ");
                num1 = Integer.parseInt(cin.nextLine());

                System.out.print("Enter second integer: ");
                num2 = Integer.parseInt(cin.nextLine());

                validInput = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter two integers.");
            }
        }
        cin.close();
        sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
    }
}

