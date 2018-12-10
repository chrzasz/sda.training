package sk.tablice;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Grzegorz Chrzaszczyk on 15-10-2018  12:23 AM
 */
public class Mediana {

    /* funkcja wyznaczająca medianę elementów podanych w tablicy. Mediana
     * jest wartością środkową, lub inaczej drugim kwartylem
     */
    public static double mediana(int[] tablica) {
        double mediana = 0; // zmienna, która będzie przechowywać medianę
        double srednia = 0.0; // zmienna do trzymania średniej wartości dwóch zmiennych
        Arrays.sort(tablica); // mediana jest wartością środkową w danym zbiorze
        // aby uzyskać tę wartość, należy w pierwszym kroku
        // posortować elementy tablicy (dowolną metodą)
        // tutaj użyliśmy wbudowanej metody Javy sort.
        // jeżeli tablica zawiera parzystą liczbę elementów, to mediana jest
        // średnią wartością dwóch środkowych elementów
        if (tablica.length % 2 == 0) {
            srednia = tablica[tablica.length / 2] + tablica[(tablica.length / 2) - 1];
            // w zmiennej średnia trzymamy sumę dwóch środkowych elementów tablicy
            mediana = srednia / 2.0; //obliczamy średnią wartość dwóch elementów

        } else // jeżeli tablica zawiera nieparzystą liczbę elementów, to mediana
        {    // jest dokładnie wartością środkową
            mediana = tablica[tablica.length / 2];
        }

        return mediana;
    }


    public static void main(String[] args) {
        int[] tab = new int[100];
        Random r = new Random();  // obiekt klasy Random do losowania wartości

        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(101); // losowanie wartości z przedziału <0:100>
            System.out.print(tab[i] + ";");
        }
        System.out.println("\nmediana = " + mediana(tab)); // wywołanie funkcji i
        // wyświetlenie wyniku
    }


}
