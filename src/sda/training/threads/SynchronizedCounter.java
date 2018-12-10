package sda.training.threads;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  03:06 PM
 */
public class SynchronizedCounter {

    private static int counter;


    public static synchronized void incrementThread() {
        counter++;
        System.out.println("INC: " + counter);
    }

    public static synchronized void decrementThread() {
        counter--;
        System.out.println("DEC: " + counter);
    }
}
