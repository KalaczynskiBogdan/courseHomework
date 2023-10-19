package hw5.fourth;

public class Image extends Media{
    private String proportion = "1920x1080";

    public Image(String name, int size, String proportion) {
        super.name = name;
        super.size = size;
        this.proportion = proportion;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", size: " + size+
                ", proportion: " + proportion);
    }
}
