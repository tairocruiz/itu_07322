/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

public class ArrayInspectorIf {
    public static void main(String[] args) {

        float[] numbers = {10, 6, 70, 1240, 10, 60, 120, 80, 565};
        float lowFlag = 0, upperFlag = 0;

        for (int c = 0; c < numbers.length; c++){
            if (c == 0){ 
                lowFlag = numbers[c];
                upperFlag = numbers[c];
            }else{
                if (lowFlag < numbers[c]){ 
                    lowFlag = lowFlag;
                }else{
                    lowFlag = numbers[c];
                }

                if (upperFlag < numbers[c]){ 
                    upperFlag = numbers[c];
                }else{
                    upperFlag = upperFlag;
                }
            }     
        }
        
        System.out.println("upperFlag : " + upperFlag);
        System.out.println("lowFlag : " + lowFlag);
    }
}