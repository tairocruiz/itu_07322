/**
 * @author T.cruiz.
 * @since  Nov `22.
 */

import java.util.Scanner;

public class CircleC{
    public static void main(String[] args) {
        int r;
        double area;
        try (Scanner put = new Scanner(System.in)) {
            System.out.print("Enter the  radius of circle :");
            r = put.nextInt();
        }
        area = Math.PI*Math.pow(r, 2);

        System.out.println("The area of a circle is " + area);
    }
}