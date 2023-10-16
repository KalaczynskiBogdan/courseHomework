package exercise1;

public class Rectangle implements Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println("Area of a rectangle: "+ a*b);
    }
}
