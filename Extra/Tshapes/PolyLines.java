import shapi.Shape;

public class PolyLines extends Shape{

       private double x2;
       private double y2;
       private double x3;
       private double y3;

       PolyLines(double x1,double y1,double x2, double y2, double x3, double y3)
       {
              this.x1=x1;
              this.y1=y1;
              this.x2=x2;
              this.y2=y2;
              this.x3=x3;
              this.y3=y3;
       }
       
       public void  move(double dx,double dy)
       {
              super.move(dx,dy);
              this.x2=this.x2+dx;
              this.y2=this.y2+dy;
              this.x3=this.x3+dx;
              this.y3=this.y3+dy;
       }
       public String show()
       {
              return String.format("polyline coordinates%n"+"x1=%f"+"y1=%f %nx2=%f y2=%f%nx3=%f",x1,y1,x2,y2,x3,y3);
       }
       public String toString()
       {
              return show();
       }



    // @Override
    // public String show() {
        
    //     return null;
    // }
    
}
