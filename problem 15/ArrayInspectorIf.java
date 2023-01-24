/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

public class ArrayInspectorIf {
    /**
     * @param args
     */
    public static void main(String[] args) {

        float[] numbers = {17,19,23,60,58,90};
        float lowFlag = 0, upperFlag = 0;

        for (int c = 0; c < numbers.length; c++){
            if (c == 0){ 
                lowFlag = numbers[c];
                upperFlag = numbers[c];
            }else{
                if (lowFlag > numbers[c]){ 
                    lowFlag = numbers[c];
                }

                if (upperFlag < numbers[c]){ 
                    upperFlag = numbers[c];
                }
            }     
        }
        
        System.out.println("The large is " + upperFlag);
        System.out.println("The Small is " + lowFlag);
    }
}