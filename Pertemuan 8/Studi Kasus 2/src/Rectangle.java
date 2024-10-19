public class Rectangle extends Shape{
    
    private double  width;
    private double length;

    public Rectangle(double w,  double l) {
        super("Rectangle");
        width = w;
        length = l;

    }

    public double area(){
        return width*length;
    }

    public String toString()
    {
        return super.toString() + "  width: " + width + " length: " + length;

    }
}