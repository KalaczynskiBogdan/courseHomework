package hw7.third;

public class FirstThread extends Thread {
    @Override
    public void run() {
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplying by two: " + i * number);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
