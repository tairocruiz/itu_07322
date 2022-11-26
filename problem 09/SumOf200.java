/**
 * @author T.cruiz.
 * @since  Nov `22.
 */ 

public class SumOf200 {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int d = 1; d <= 200; d++){
            sum+=d;
        }

        System.out.print("The sum of first 200 counting integers is : " + sum);
    }
 }