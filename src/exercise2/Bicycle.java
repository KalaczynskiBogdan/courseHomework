package exercise2;

public class Bicycle implements Transport{
    @Override
    public void start() {
        System.out.println("Bicycle has started to drive");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle has stopped a driving");
    }

    @Override
    public void getSpeed() {
        System.out.println("Bicycle has got some speed");
    }
}
