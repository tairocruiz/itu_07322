import java.util.Scanner;

import shapi.*;

public class Driver {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        Lines L1 = new Lines(10,20,12,13);
        Rectangles r1= new Rectangles(12,10.5,6.8,13.4);
        Circles c1= new Circles(10.2,20.2,12);
        PolyLines pl1= new PolyLines(12,10.56,8,13.4,11.5,11.4);
        
        int ch = 0;
        double dx = 0;
        double dy = 0;

        while(true)
        {
            System.out.println("Menu Driven-To move");
            System.out.println("1.line");
            System.out.println("2.circle");
            System.out.println("3.Rectangle");
            System.out.println("4.polyline");
            System.out.println("5.Exit");
            System.out.println(" Enter u r choice:");
            ch=sc.nextInt();

            if(ch>5)
            {
                    System.out.println("Enter(dx,dy):");
                    dx=sc.nextDouble();
                    dy=sc.nextDouble();
            }
            switch(ch)
            {
                    case 1:
                    System.out.println(L1);
                    L1.move(dx,dy);
                    System.out.println("move coordinates");
                    System.out.println(L1);
                    break;

                    case 2:
                    System.out.println(c1);
                    L1.move(dx,dy);
                    System.out.println("move coordinates");
                    System.out.println(c1);
                    break;

                    case 3:
                            System.out.println(r1);
                            L1.move(dx,dy);
                            System.out.println("move coordinates");
                            System.out.println(r1);
                            break;

                    case 4:
                            System.out.println(pl1);
                            L1.move(dx,dy);
                            System.out.println("move coordinates");
                            System.out.println(pl1);

                            L1.move(dx,dy);
                            System.out.println("move coordinates");
                            System.out.println(r1);
                            break;

                    /*case 4:
                            System.out.println(pl1);
                            l1.move(dx,dy);
                            System.out.println("move coordinates");
                            System.out.println(pl1);
                            break;*/

                    case 5:
                            System.out.println("program is exiting");
                            System.exit(0);
            }
        }
    }
}
    

