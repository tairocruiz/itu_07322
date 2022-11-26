/**
 * @author T.cruiz.
 * @since  Nov `22.
 */
import java.util.Scanner;
public class Arthmetical{
    public static void main(String[] args) {
        int a, b, c, sum, prod, avg, bigger;
        Scanner put = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        a = put.nextInt();
        b = put.nextInt();
        c = put.nextInt();
        sum = a + b + c;
        avg = sum / 3;
        prod = a*b*c;
        // using if of identation (has no curl braces)
        if (a > b)
            if (a > c)
                bigger = a;
            else
                bigger = c;
        else
            if (b > c)
                bigger = b;
            else
                bigger = c;

        System.out.println("The sum of three integer is " + sum);
        System.out.println("The average of three integer is " + avg);
        System.out.println("The product of three integer is " + prod);
        System.out.println("The bigger of three integer is " + bigger);
    }
}