/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

// if you are using cmd use "javac Aritnmetic.java -d . " command to compile a box package class.

// make sure you have already compile the Aritnmetic before you run this.

import arithmetic.Arithmetic;

public class ArithmeticTest {
    public static void main(String[] args) {

        double sum, res;

        Arithmetic myTest = new Arithmetic(8, 5);

        sum = myTest.add();
        res = myTest.divide();

        System.out.println("The sum is : " + sum);
        System.out.println("The result in division is : " + res);

    }
}
