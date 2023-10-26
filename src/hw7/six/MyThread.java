package hw7.six;

public class MyThread extends Thread{
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished, counter is " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to start");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}
