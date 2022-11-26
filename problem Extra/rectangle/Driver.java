import drive.RectangleA;

import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
        double height, width;
		try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of rectangle:");
            height = input.nextDouble();

            System.out.print("Enter width of rectangle:");
            width = input.nextDouble();
        }
	
        RectangleA rec = new RectangleA(width, height);
		
		System.out.printf("Area: %f, Perimeter: %f", rec.getArea(), rec.getPerimeter());
		
	}
	
   
} 
    

