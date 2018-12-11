package sk.wyrazenieLambda;

/**
 * Created by Grzegorz Chrzaszczyk on 11-12-2018  01:35 AM
 */
public class Main {
    public static void main(String[] args) {

        Czlowiek czlowiek = new Czlowiek() {
            @Override
            public void mysl() {
                System.out.println("Czlowiek mysli..");
            }
        };
        czlowiek.mysl();

        Korporacja korporacja = new Korporacja();
        korporacja.zarzadzaj(new Czlowiek() {
            @Override
            public void mysl() {
                System.out.println("Czlowiek mysli.....");
            }
        });

        // Lampbda operator: ->
        // dla implementacji intefejsu tylko z jedna metoda!
        // Lambda z prawej strony operatora znajduje sie implementacja metody (cialo metody)
        // po lewej od operatora znajduje sie lista parametrow (definiujemy parametry)
        korporacja.zarzadzaj(()-> System.out.println("Lambda mysli.."));

    }
}

class Korporacja {
    public void zarzadzaj(Czlowiek cz) {
        System.out.println("Zarzadzaj..");
        cz.mysl();
    }
}

interface Czlowiek {
    void mysl();
}
