package sda.training.threads;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  02:33 PM
 */
public class MyThread extends Thread {

//    Zaimplementuj klasę rozszerzającą klasę Thread, która ma pola: threadName i counterLimit. Napisz kod,
//    który sprawi, że wykonywany wątek będzie wypisywał informację w formacie [name]: x, gdzie x jest liczbą
//    całkowitą od 0 do counterLimit.
//    Utwórz trzy instancje tej klasy z dowolnymi parametrami (dla wygody nie nadawaj counterLimit wartości
//            większych niż 10). Uruchom te wątki i zaobserwuj efekt wywołania. Jak go skomentujesz?

    public String threadName;
    public int counterLimit;
    private int sleepTime = 10;

    public MyThread(String threadName, int counterLimit) {
        this.threadName = threadName;
        this.counterLimit = counterLimit;
    }

    @Override
    public void run() {

        for (int i = 0; i < counterLimit; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
