package hw5.fifth;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        circle.area();
        circle.perimeter();
        Shape rectangle = new Rectangle(2,4);
        rectangle.area();
        rectangle.perimeter();
        Shape triangle = new Triangle(3,4,5,3);
        triangle.area();
        triangle.perimeter();
    }
}
