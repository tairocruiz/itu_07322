/**
 * @author T.cruiz.
 * @since  Nov 2022.
 * @
 */ 

public class ArrayInspector {
    public static void main(String[] args) {

        float[] numbers = {50, 3, 20, 60, 120, 80, 225};

        float lowFlag = 0, upperFlag = 0;

        for (int c = 0; c < numbers.length; c++){
            lowFlag = (c == 0) ? numbers[c] : ((lowFlag < numbers[c]) ? lowFlag : numbers[c]);
            upperFlag = (c == 0) ? numbers[c] : ((upperFlag < numbers[c]) ? numbers[c] : upperFlag);
        }

        System.out.println("lowflag : "+ lowFlag);
        System.out.println("upperFlag : "+ upperFlag);

    }
}