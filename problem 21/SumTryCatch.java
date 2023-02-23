import java.util.Scanner;

public class SumTryCatch {

  int opr1;
  int opr2;
  

  public static void main(String[] args) throws Exception {
    int sum;

    try (Scanner pt = new Scanner(System.in)) {
      SumTryCatch otp = new SumTryCatch();

      try {
        otp.opr1 = pt.nextInt();
        otp.opr2 = pt.nextInt();
        if (otp.opr1 != 0 && otp.opr1 != 0) {
          sum = otp.opr1 + otp.opr2;
          System.out.println("sum: " + sum);
        } else {
          // Throwable tai = new Throwable();
          throw new Exception(
            "Access denied - an input has to be a number greater to 0 atleast one operand!" 
          );
        }
       
      } catch (Exception tai) {
        
        System.out.println("Exception: class responsible is : " + tai.getMessage());
      }
    }
  }
}
