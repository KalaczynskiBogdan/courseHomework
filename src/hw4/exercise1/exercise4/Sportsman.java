package hw4.exercise1.exercise4;

public class Sportsman {
    private String name;
    private static int bestScore = 0;

    public Sportsman(String name) {
        this.name = name;
    }

    public int updateBestScore(int newScore) {
        if (newScore > bestScore) {
            bestScore = newScore;
        }
        return bestScore;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman("Oleg");
        int a = sportsman1.updateBestScore(3);
        Sportsman sportsman2 = new Sportsman("Aleks");
        int b = sportsman2.updateBestScore(7);
        Sportsman sportsman3 = new Sportsman("Bohdan");
        int c = sportsman3.updateBestScore(24);

        if (a == bestScore) {
            System.out.println("The best scorer: " + sportsman3.getName() + ", with result: " + bestScore);
        } else if (b == bestScore) {
            System.out.println("The best scorer: " + sportsman2.getName() + ", with result: " + bestScore);
        } else if (c == bestScore) {
            System.out.println("The best scorer: " + sportsman3.getName() + ", with result: " + bestScore);
        }
    }
}

