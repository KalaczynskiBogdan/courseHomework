package hw5.fifth;

public class Circle extends Shape{
    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double areaResult = radius*radius*pi;
        System.out.println("Area of circle: " + areaResult);
    }

    @Override
    void perimeter() {
        double perimeterResult = 2*radius*pi;
        System.out.println("Perimeter of circle: " + perimeterResult);
    }
}
