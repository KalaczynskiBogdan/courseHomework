package hw7.third;

public class SecondThread extends Thread {
    @Override
    public void run() {
        int number = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplying by three: " + i * number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
