class Box
{
    private float height;
    private float length;
    private float width;

    public BoxTest(float hg, float ln, float wd){
        this.height = hg;
        this.length = ln;
        this.width = wd;
    }

    public float calculateVolume(){
        return height*width*height;
    }
}

public class BoxTest 
{
  static void Main(string[] args)
  {
    Box myBox = new Box(7, 8, 3);
    Console.WriteLine(myBox.calculateVolume());
  }
}