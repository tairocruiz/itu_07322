/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

public class ArrayArthmetic {
    public static void main(String[] args) {
        int sum = 0, avg;

        int[] arr = {10, 38, 37, 28, 18, 57, 36, 58, 17, 48, 27, 58};

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        avg = sum / arr.length;

        System.out.println(" The Summation of array element is : " + sum);
        System.out.println(" The average is : " + avg);
    }
}