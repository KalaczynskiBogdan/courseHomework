package hw4.exercise1.exercise2;

public class Car implements Transport {
    @Override
    public void start() {
        System.out.println("Car has started to drive");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped a driving");
    }

    @Override
    public void getSpeed() {
        System.out.println("Car has got some speed");
    }
}
