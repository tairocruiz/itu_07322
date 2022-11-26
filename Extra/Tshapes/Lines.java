import shapi.Shape;

public class Lines extends Shape{

    private double x2;
    private double y2;

    public Lines(double x1,double y1,double x2, double y2)
    {
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
    }

    public void move(double dx,double dy)
    {
            super.move(dx,dy);
            this.x2=this.x2+dx;
            this.y2=this.y2+dy;
    }

    public String show(){
            return String.format("Line coordinates%nX= %f"+" y1 = %f %nx2 = %f y2 = %f",x1,y1,x2,y2);
    }

    public String toString()
    {
            return show();
    }

    @Override
    public String show() {
        return null;
    }
}
