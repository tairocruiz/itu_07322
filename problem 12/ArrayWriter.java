/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 
import java.util.Scanner;

public class ArrayWriter {
    public static void main(String[] args) {

        double[] arr = new double[20];
        try (Scanner cin = new Scanner(System.in)) {
            for (int d = 0; d < arr.length; d++){
                System.out.print("enter a value of arr[" + d +"] : ");
                arr[d] = cin.nextDouble();
            }
            /* if you want to print the output uncomment the lines below */
            // for(int i = 0; i < arr.length; i++){
            //     System.out.println(" arr[" + i + "] = " + arr[i]);
            // }
        }
    }
}