/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

package arithmetic;

public class Arithmetic {

    float number1;
    float number2;
    
    public Arithmetic(float nc, float bc) {
        number1 = nc;
        number2 = bc;
    }

    public double add() {
        return (number1 + number2);
    }

    public float divide() {
        return (number1 / number2);
    }
}