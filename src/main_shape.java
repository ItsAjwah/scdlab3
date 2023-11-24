import java.util.Scanner;

public class main_shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of the rectangle: ");
        double rectWidth = scanner.nextDouble();
        System.out.print("Enter length of the rectangle: ");
        double rectHeight = scanner.nextDouble();

        // Create instances of different shapes
        Shape rectangle = new Rectangle(rectWidth, rectHeight);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.print("\nEnter radius of the circle: ");
        double circleRadius = scanner.nextDouble();


        Shape circle = new Circle(circleRadius);
        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.print("\nEnter side length of the square: ");
        double squareSide = scanner.nextDouble();

        Shape square = new Square(squareSide);
        System.out.println("\nSquare:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        scanner.close(); // Close the scanner when done
    }
}