/**
 * @author T.cruiz.
 * @since  Nov `22.
 */

import java.util.Scanner;

public class Odd{
    public static void main(String[] args) {
        int no, ans, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        no = scan.nextInt();

        ans = no % 2;
        if (ans == 1)
            System.out.println("The number " + no + " is an odd");
        else
            System.out.println("The number " + no + " is not an odd");
    }
}