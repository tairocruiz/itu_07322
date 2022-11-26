package shapi;

public abstract class Shape{

    protected double x1;
    protected double y1;

    public void move(double dx,double dy)
    {
            this.x1=this.x1+dx;
            this.y1=this.y1+dy;
    }

    public abstract String show();

    public String toString()
    {
            return(x1+" "+y1);
    }
}