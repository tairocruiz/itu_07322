/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

public class ArrayAlgoIf {
    public static void main(String[] args) {

        float[] numbers = {50, 10, 20, 60, 120, 90};
        float lowFlag = 0, upperFlag = 0;

        // long buggie algorthm : using if else
        for (int t = 0; t < numbers.length; t++){
            for (int c = 0; c < numbers.length; c++){
                if(numbers[t] == 0){
                   lowFlag = numbers[t];
                }else {
                    if(lowFlag == 0){
                        lowFlag = numbers[0];
                    }else{  
                        if (lowFlag > numbers[c]){
                            lowFlag = numbers[c];
                            if (lowFlag == numbers[c]){
                                break;
                            }
                        }
                    }
                }
                if (c == 0){
                    upperFlag = numbers[c];
                }else {
                    if (upperFlag < numbers[c]){ 
                        upperFlag = numbers[c];
                    }else{
                        upperFlag = upperFlag;
                    }
                }
            }
        }
        System.out.println("lowflag : "+ lowFlag);
        System.out.println("UpperFlag : " + upperFlag);

    }
}