package hw7.fourth;

public class Counter {
    private int number = 1;

    public synchronized void multiply(){
        number *= 2;
    }

    public synchronized int getNumber() {
        return number;
    }
}
class CounterThread extends Thread{
    Counter counter;
    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            counter.multiply();
            System.out.println("multiplied to: " + counter.getNumber());
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);
        thread1.start();
        thread2.start();
    }
}

