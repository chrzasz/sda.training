package sda.training.threads;
import static java.lang.Thread.yield;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  02:32 PM
 */
public class Runner {

    public static void main(String[] args) {

        Thread t1 = new MyThread("TH-1",3);
        Thread t2 = new MyThread("TH-2",3);
        Thread t3 = new MyThread("TH-3",3);
        Thread t4 = new MyThread("TH-4",3);
        Thread t5 = new MyThread("TH-5",3);

        t4.setPriority(1); //lowest
        t1.setPriority(10);//higest


//        t1.start();t2.start();t3.start();t4.start();t5.start();
//        t5.start();//nie mozna startowac watku wiecej niz raz !!!


        Thread decrementThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    SynchronizedCounter.decrementThread();
                    yield();
                }
            }
        });

        Thread incrementThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    SynchronizedCounter.incrementThread();
                    yield();
                }
            }
        });

        decrementThread.setPriority(10);
        decrementThread.start();
        incrementThread.setPriority(1);
        incrementThread.start();






    }
}
