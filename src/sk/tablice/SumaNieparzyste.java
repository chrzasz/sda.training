package sk.tablice;

import java.util.Random;

/**
 * Created by Grzegorz Chrzaszczyk on 15-10-2018  12:30 AM
 */
public class SumaNieparzyste {
    /* funkcja zwracająca sumę nieparzystych elementów w tablicy.
     * Do funkcji przekazywana jest tablica. Następnie poszczególne
     * jej elementy są sumowane a wynik wpisywany jest do określonej zmiennej.

     *
     */
    public static int suma_nieparzyste(int[] tablica) {
        int suma = 0;  // w tej zmiennej będziemy trzymać sumę elementów tablicy

        for (int i = 0; i < tablica.length; i++) // tutaj przejście po tablicy
        {
            if (tablica[i] % 2 == 1)  // przy pomocy sumy modulo 2 sprawdzamy
            {                         // czy dany element jest nieparzysty
                suma = suma + tablica[i]; // dodajemy kolejne nieparzyste elementy
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] tab = new int[4];
        Random r = new Random();  // obiekt klasy Random do losowania wartości

        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(16) + 5; // losowanie wartości z przedziału <5:20>
            System.out.print(tab[i] + ";");
        }
        System.out.println("\nsuma niepqrzystych = " + suma_nieparzyste(tab)); // wywołanie funkcji i
        // wyświetlenie wyniku
    }
}
