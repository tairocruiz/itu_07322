/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

public class ArrayAlgo {
    public static void main(String[] args) {

        float[] numbers = {50, 10, 20, 60, 120, 90};
        float lowFlag = 0, upperFlag = 0;

        // long buggie algorthm : using ternary
        for (int t = 0; t < numbers.length; t++){
            if (numbers[t] == 0){ // if one of the array element is 0 assign it to lowFlag.
                lowFlag = numbers[t]; 
                break;
            }
            for (int c = 0; c < numbers.length; c++){
                upperFlag = (c == 0) ? numbers[c] : ((upperFlag < numbers[c]) ? numbers[c] : upperFlag);
                lowFlag = (numbers[t] == 0)? 0 : ((lowFlag == 0) ? numbers[0] : ((lowFlag > numbers[c])? numbers[c] : lowFlag));
            }
        }
        
        //printing
        System.out.println("lowflag : "+ lowFlag);
        System.out.println("UpperFlag : " + upperFlag);

    }
}