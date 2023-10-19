package hw5.fighting;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("KNIGHT", 1000, 10, 2);
        Fighter fighter2 = new Fighter("ARCHER", 900, 5, 3);
        Start start = new Start();
        start.start(fighter1, fighter2);
    }
}
