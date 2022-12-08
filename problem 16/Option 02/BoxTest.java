/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

// if you are using cmd use "javac Box.java -d . " command to compile a box package class.

// make sure you have already compile the Box before you run this.

import box.Box; // import a compiled .class file
import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        double a, b, c;
        try (Scanner newOb = new Scanner(System.in)) {
            System.out.print("Enter the length : ");
            a = newOb.nextDouble();

            System.out.print("Enter the height : ");
            b = newOb.nextDouble();

            System.out.print("Enter the width : ");
            c = newOb.nextDouble();
        }
        Box pcBox = new Box(a, c, b);
        pcBox.calculateVolume();
    }
}