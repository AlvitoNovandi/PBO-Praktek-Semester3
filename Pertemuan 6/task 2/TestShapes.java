public class TestShapes {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape = new Shape();
        System.out.println(shape);
        
        shape.setColor("red");
        shape.setFilled(false);
        System.out.println(shape);

        // Test Circle class
        Circle circle = new Circle(2.5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test Rectangle class
        Rectangle rectangle = new Rectangle("blue", true, 4.0, 5.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Square class
        Square square = new Square(3.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Test square dimensions
        square.setLength(4.0);
        System.out.println(square);
    }
}
