package hw5.fourth;

public class Main {
    public static void main(String[] args) {
        Media image = new Image("Audio", 100, "1920x1080");
        Media video = new Video("Video", 100, 2);
        Media audio = new Audio("Audio", 100, 3);

        image.displayInfo();
        video.displayInfo();
        audio.displayInfo();
    }
}
