/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

package box;

public class Box{
    double length;
    double width;
    double height;

    public Box(double h, double w, double l) {
        height = h;
        width = w;
        length = l;
    }

    public void calculateVolume() {
        System.out.println("The volume of a box is : " + (height*width*length));
    }
}
