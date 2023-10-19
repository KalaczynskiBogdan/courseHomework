package hw5.fifth;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void area() {
        int areaResult = a*b;
        System.out.println("Area of rectangle: " + areaResult);
    }

    @Override
    void perimeter() {
        double perimeterResult = 2*(a+b);
        System.out.println("Perimeter of rectangle: " + perimeterResult);
    }
}
