// package practicles;
import java.lang.Exception;

public class Encrypt {
    
    public Encrypt() {
       
    }

    public Encrypt(String a) {
        
    }

    public static void main(String[] args) {
        
        try {
            System.out.println("name");
            if (args[0] != null)
                System.out.println(args[0]);
            else
                System.out.println("args[0]");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    private static Object Encrypt(String string) {
        return null;
    }
}
