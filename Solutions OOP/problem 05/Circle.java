/**
 * @author T.cruiz.
 * @since  Nov `22.
 */

import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        int r;
        double area;
        Scanner put = new Scanner(System.in);
        System.out.print("Enter the  radius of circle :");
        r = put.nextInt();
        area = 3.14*r*r;

        System.out.println("The area of a circle is " + area);
    }
}