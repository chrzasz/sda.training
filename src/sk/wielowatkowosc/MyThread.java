package sk.wielowatkowosc;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("My thread : "+ Thread.currentThread().getName() );
    }
}
