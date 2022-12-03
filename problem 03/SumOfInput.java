/**
 * @author T.cruiz.
 * @since  Nov `22.
 */

import java.util.Scanner;

public class SumOfInput{
    public static void main(String[] args) {
        int a, b, sum;
        try (Scanner put = new Scanner(System.in)) {
            System.out.println("Enter the numbers :");
            a = put.nextInt();
            b = put.nextInt();
        }
        sum = a + b;
        System.out.println("The sum of two integer is " + sum);
    }
}