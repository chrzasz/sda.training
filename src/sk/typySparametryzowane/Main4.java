package sk.typySparametryzowane;

/**
 * Created by Grzegorz Chrzaszczyk on 10-12-2018  11:05 PM
 */
public class Main4 {
    public static void main(String[] args) {

        Zamowienie<Integer, Double> zamowienie = new Zamowienie<>(10, 100.123);
        System.out.println("ident. zamowienia: " + zamowienie.pobierzIdentyfikator());
        System.out.println("wartosc zamowienia: " + zamowienie.pobierzWartosc());

    }
}

class Zamowienie<I, W> implements Informacje<I, W> {

    private I identyfikator;
    private W wartosc;

    public Zamowienie(I identyfikator, W wartosc) {
        this.identyfikator = identyfikator;
        this.wartosc = wartosc;
    }

    @Override
    public I pobierzIdentyfikator() {
        return identyfikator;
    }

    @Override
    public W pobierzWartosc() {
        return wartosc;
    }
}

// Parametryzacja interfejsów
interface Informacje<I, W> {
    I pobierzIdentyfikator();

    W pobierzWartosc();
}




