package drive;

public class RectangleA {

        private double height;
        private double width;
        
        public RectangleA(double wid, double high) {
            height = high;
            width = wid;
        } 
        
        // this is bocoz java doesn`t support default parameter value like RectangleA(double wid = 2.00, double high = 2.00). so we need two constructo
        public RectangleA(){
            height = 1;
            width = 1;
        } 
        
        public void setHeight(double high) {
            height = high;
        }
        
        public void setWidth(double wid){
            width = wid;
        }
        
        public double getArea() {
            return height*width;
        }
        
        public double getPerimeter() {
            return 2*(height + width);
        }
  
}
