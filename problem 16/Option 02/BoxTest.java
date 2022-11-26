/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

// if you are using cmd use "javac Box.java -d . " command to compile a box package class.

// make sure you have already compile the Box before you run this.

import box.Box; // import a compiled .class file

public class BoxTest {
    public static void main(String[] args) {
        Box pcBox = new Box(5, 4, 7);
        pcBox.calculateVolume();
    }
}