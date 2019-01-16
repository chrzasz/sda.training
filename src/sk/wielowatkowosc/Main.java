package sk.wielowatkowosc;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread : "+ Thread.currentThread().getName() );
        Thread thread = new MyThread("My Thread 1");

        thread.start();
    }
}
