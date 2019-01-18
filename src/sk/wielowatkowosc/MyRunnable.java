package sk.wielowatkowosc;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Main thread : " + Thread.currentThread().getName());

    }
}
