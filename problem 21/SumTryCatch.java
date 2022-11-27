
import java.util.Scanner;

public class SumTryCatch {

    int opr1;
    int opr2;
    
    public static void main(String[] args) {
        int sum;

        Scanner pt = new Scanner(System.in);
        SumTryCatch otp = new SumTryCatch();

        try {
            otp.opr1 = pt.nextInt();
            otp.opr2 = pt.nextInt();
            if( otp.opr1 != 0 && otp.opr1 != 0 ){

                sum = otp.opr1 + otp.opr2;
                System.out.println("sum: " + sum);

            }else{
                throw new ArithmeticException("Access denied - an input has to be a number greater to atleast one operand!");
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
