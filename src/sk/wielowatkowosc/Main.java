package sk.wielowatkowosc;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread : " + Thread.currentThread().getName());
        Thread thread1 = new MyThread("My Thread 1");
        Thread thread2 = new MyThread("My Thread 2");

        thread1.start();
        thread2.start();

        Thread anotherThread = new Thread(
                () -> System.out.println("Runnable thread : " + Thread.currentThread().getName()),
                "My-Runnable-1");

        anotherThread.start();
    }
}
