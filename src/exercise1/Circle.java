package exercise1;

public class Circle implements Shape{
    private int r;
    private double pi = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("Area of a circle: " + r*r*pi);
    }
}
