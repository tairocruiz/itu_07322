/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

// if you are using cmd use "javac Box.java -d . " && "javac ColouredBox.java -d . " command to compile a box package class.

// make sure you have already compile the Box && ColouredBox to ./box dir before you run this.

import box.ColouredBox; // import a compiled .class file
// you can simulate it with user inputs using Scanner.

public class ColouredBoxTest {
    public static void main(String[] args) {
        ColouredBox tank = new ColouredBox("Dark-Blue", 6, 7, 8);
        System.out.println("Box color : " + tank.getColour() + ", Volume = " + tank.calculateVolume());
    }
}