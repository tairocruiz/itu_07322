class Box{

    private float length;
    private float width;
    private float height;

    public Box(float h, float w, float l) {
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public float calculateVolume() {
        return (this.height * this.width * this.length);
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box pcBox = new Box(7, 8, 3); 
        System.out.println("The volume of a box is : " + pcBox.calculateVolume());
    }
}

// on cmd navigated DIR just write " javac BoxTest.java && java BoxTest " if you have JDK run app on your machine