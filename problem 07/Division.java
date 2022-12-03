/**
 * @author T.cruiz.
 * @since  Nov `22.
 */

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int no1, no2, ans;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number :");
            no1 = scan.nextInt();
            System.out.print("Enter a devidend :");
            no2 = scan.nextInt();
        }
        if (no2 == 0 ){
            System.out.println("This calculation cant be done!");
        }else{
            ans = no1 / no2;
            System.out.println("The answer is : " + ans);
        }
    }
}