/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

package box;

public class ColouredBox extends Box {

    protected String colour;

    public ColouredBox(String bxC, float hg, float wd, float ln) {
        super(hg, wd, ln);
        colour = bxC;
    }
    
    public String getColour(){
        return colour;
    }

}
    