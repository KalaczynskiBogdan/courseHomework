package hw5.fifth;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    void area() {
        double areaResult = (a*h)/2;
        System.out.println("Area of triangle: " + areaResult);
    }

    @Override
    void perimeter() {
        double perimeterResult = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeterResult);
    }
}
