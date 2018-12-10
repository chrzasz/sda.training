package sk.typySparametryzowane;

/**
 * Created by Grzegorz Chrzaszczyk on 10-12-2018  10:42 PM
 */
public class KlasaGeneryczna<T, V> { // typ moze byc wlasny np EVENTS, PERSONAL_DATA itp..

    private T poleGeneryczne;
    private V drugiePoleGeneryczne;

    public KlasaGeneryczna() {
    }

    public KlasaGeneryczna(T poleGeneryczne, V drugiePoleGeneryczne) {
        this.poleGeneryczne = poleGeneryczne;
        this.drugiePoleGeneryczne = drugiePoleGeneryczne;
    }


    public void nazwaTypuGenerycznego() {
        System.out.println("Typ T, to: " + poleGeneryczne.getClass().getName());
        System.out.println("Typ V, to: " + drugiePoleGeneryczne.getClass().getName());

    }

    public T getPoleGeneryczne() {
        return poleGeneryczne;
    }

    public void setPoleGeneryczne(T poleGeneryczne) {
        this.poleGeneryczne = poleGeneryczne;
    }


}
