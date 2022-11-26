/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

public class LoopTable {
    public static void main(String[] args) {

        System.out.println("N\t10*N\t100*N\t1000*N\n"); // \t == TAB == 4 space (US standard keyboard).

        for(int d = 1; d <= 5; d++){
            System.out.println(d + "\t" + (d*10) + "\t" + (100*d) + "\t" + (d*1000) );
        }

    }
 }