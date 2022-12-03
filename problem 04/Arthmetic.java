/**
 * @author T.cruiz.
 * @since  Nov `22.
 */

import java.util.Scanner;

public class Arthmetic{
    public static void main(String[] args) {
        int a, b, c, sum, prod, avg, bigger;
        try (Scanner put = new Scanner(System.in)) {
            System.out.println("Enter the numbers :");
            a = put.nextInt();
            b = put.nextInt();
            c = put.nextInt();
        }
        sum = a + b + c;
        avg = sum / 3;
        prod = a*b*c;

        bigger = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); // using ternary operator

        System.out.println("The sum of three integer is " + sum);
        System.out.println("The average of three integer is " + avg);
        System.out.println("The product of three integer is " + prod);
        System.out.println("The bigger of three integer is " + bigger);
    }
}