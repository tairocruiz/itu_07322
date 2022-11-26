import shapi.Shape;

public class Circles extends Shape {

    private double r;
    Circles(double x1, double y1, double r)
    {
            this.x1=x1;
            this.y1=y1;
            this.r=r;
    }

    public void move(double dx, double dy)
    {
            super.move(dx,dy);
    }

    public String show()
    {
            return String.format("circle coordinates %nCenter(x1=%f"+" y1=%f)%nRadius= %f",x1,y1,r);
    }

    public String toString()
    {
            return show();
    }

    @Override
    public String how() {
        return null;
    }
    
}
