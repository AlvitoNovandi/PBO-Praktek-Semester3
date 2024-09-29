public class Rectangle extends Shape {
    private double width;
    private double length;

    // Konstruktor tanpa argumen
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Konstruktor dengan lebar dan panjang
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Konstruktor dengan parameter
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled); // Memanggil konstruktor superclass Shape
        this.width = width;
        this.length = length;
    }

    // Getter dan Setter untuk width dan length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Metode untuk menghitung area dan perimeter
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
