package hw5.fourth;

public class Video extends Media{
    private int duration = 3;

    public Video(String name, int size, int duration) {
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
