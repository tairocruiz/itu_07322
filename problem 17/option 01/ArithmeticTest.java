/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

class Arithmetic {

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

public class ArithmeticTest {
    public static void main(String[] args) {
        double sum, res;

        Arithmetic myTest = new Arithmetic(8, 5);

        sum = myTest.add();
        res = myTest.divide();

        System.out.println("The sum is : " + sum);
        System.out.println("The result in division is : " + res);
    }
}
