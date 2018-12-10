package sk.tablice;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 15-10-2018  12:36 AM
 */
public class Pascal {


    /* Program rysujący trójkąt Pascala o zadanej przez użytkownika wielkości.
     * W programie zastosowane zostaną dwie dodatkowe funkcje. Pierwsza z nich
     * posłuży do wyliczenia wartości na danej pozycji w wierszu
     * natomiast druga funkcja pozwoli na wyrównanie wyświetlania liczb.
     */


    public static String dodaj_puste(int liczba, int spacja) {
        String zapisz = liczba + ""; // najpierw wpisujemy liczbę do zapisania
        while (zapisz.length() < spacja) // następnie w pętli dodajemy puste miejsca
        {
            zapisz = zapisz + " ";
        }
        return zapisz; // zwracamy liczbę i puste miejsca z prawej strony
    }

    public static int Oblicz_wartosc(int wiersz, int kolumna) {
        if (kolumna == 1 || kolumna == wiersz) // pierwsza i ostatnia kolumna w każdym
        {       // wierwszu w trójkącie jest zawsze równa 1
            return 1;
        } else // w przeciwnym wypadku rekurencyjnie obliczamy wartość na podstawie
        {   // wartości znajdujących się nad liczą wiersz wcześniej
            return Oblicz_wartosc(wiersz - 1, kolumna - 1) + Oblicz_wartosc(wiersz - 1, kolumna);
        }
    }

    public static void main(String[] args) {
        int h;  // zmienna do przechowywania wysokości trójkąta
        Scanner wej = new Scanner(System.in);
        System.out.println("podaj wysokosc trojkata: ");
        h = wej.nextInt();  // wartość podawana przez użytkownika

        for (int i = 1; i <= h; i++)  // dla każdego wiersza
        {
            for (int j = 1; j <= h - i; j++)  // w każdym wierszu zaczynamy od kilku
            {                 // spacji aby poprawnie wyświetlać trójkąt
                System.out.print("   "); // w pierwszym wierszu 3 spacje
            }                          // w drugim 6, w trzecim 9 i tak dalej
            for (int k = 1; k <= i; k++) {
                System.out.print(dodaj_puste(Oblicz_wartosc(i, k), 6));
            }
            System.out.println();
        }
    }
}
