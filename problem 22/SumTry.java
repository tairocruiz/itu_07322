import java.util.Scanner;

public class SumTry {
    public static void main(String[] args) {
        float n = 0, m = 0, quo;
        boolean arise = false;
        Scanner cin = new Scanner(System.in);
        while (!arise) {
            try {
                System.out.print("Enter a number one : ");
                n = Float.parseFloat(cin.nextLine());
                System.out.print("Enter a number two : ");
                m = Float.parseFloat(cin.nextLine());

                arise = true;

            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid numeric characters " + e.toString());
            }
        }
        
        cin.close();
        quo = n/m;
        System.out.println("The quotient is : " + quo);
    }
}
