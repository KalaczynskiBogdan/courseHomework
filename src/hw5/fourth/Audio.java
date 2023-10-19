package hw5.fourth;

public class Audio extends Media{
    private int duration = 2;

    public Audio(String name, int size, int duration) {
        super.name = name;
        super.size = size;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", size: " + size+
                ", duration: " + duration);
    }
}
