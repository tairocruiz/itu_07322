/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

package box;

public abstract class Box{

    protected float length;
    protected float width;
    protected float height;

    public Box(float h, float w, float l) {
        height = h;
        width = w;
        length = l;
    }

    public double calculateVolume() {
        return (height*width*length);
    }
}
