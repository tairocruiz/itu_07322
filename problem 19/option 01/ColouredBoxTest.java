/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

abstract class Box{

    protected float length;
    protected float width;
    protected float height;

    public Box(float h, float w, float l) {
        height = h;
        width = w;
        length = l;
        
    }

    // an abstract method can be defined to its 1st successor classes || it is like a prototype
    // any class that extends this(Box) class will have to define it.
    public abstract double calculateVolume();

}

class ColouredBox extends Box {

    protected String colour;

    public ColouredBox(String bxC, float hg, float wd, float ln) {
        super(hg, wd, ln);
        colour = bxC;
    }
    public String getColour(){
        return colour;
    }
    
    public String setColour(String color){
        return this.colour = color;
    }
    
    // extends a prototype from Box class
    public double calculateVolume() {
        return (height*width*length);
    }

}

public class ColouredBoxTest {
    public static void main(String[] args) {
        ColouredBox tank = new ColouredBox("Red", 10, 7, 2);
        System.out.println("Box color : " + tank.getColour() + ", Volume = " + tank.calculateVolume());
    }
}


