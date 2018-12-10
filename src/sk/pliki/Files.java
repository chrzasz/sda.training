package sk.pliki;
import java.io.*;
import java.util.Scanner;
/**
 * Created by Grzegorz Chrzaszczyk on 15-10-2018  12:52 AM
 */
public class Files {

    // pliki tekstowe

    // dodanie throws IOException do nagłówka funkcji jest konieczne, ponieważ
    // wewnątrz tej funkcji nie zamierzamy obsługiwać ewentualnych wyjątków,
    // ale przekazać je dalej
    public static void odczytPlikuTekstowego(String nazwa) throws IOException {
        // klasa FileReader służy do odczytu plików tekstowych
        // następuje automatyczna konwersja odczytanych bajtów na znaki
        // unicode (16 bitowe)
        FileReader plikWe = null;
        try {
            plikWe = new FileReader(nazwa);
            System.out.println("Odczyt znak po znaku:\n");
            int c;
            // odczyt pliku znak po znaku i wyświetlenie na ekranie monitora
            while ((c = plikWe.read()) != -1) { // jeżeli c = -1 to koniec pliku
                System.out.print((char)c);
            }
        } finally { // klauzula finally służy do wykonania instrukcji
            // niezależnie od tego kiedy i w jaki sposób (normalnie lub
            // przez wyjątek) zostało zakończone wykonywanie bloku try
            if (plikWe != null) {
                plikWe.close(); // zamknięcie pliku
            }
        }
        // odczyt wiersz po wierszu
        BufferedReader plik2 = null;
        try {
            plik2 = new BufferedReader(new FileReader(nazwa));
            System.out.println("\n\nOdczyt buforowany:\n");
            String l = plik2.readLine();
            while (l != null) {
                System.out.println(l);
                l = plik2.readLine();
            }
        } finally {
            if (plik2 != null) {
                plik2.close();
            }
        }
    }

    public static void zapisPliku(String nazwa) throws IOException {
        FileWriter plikWy = null;
        try {
            // tworzy nowy plik jeżeli nie istnieje, w przeciwnym przypadku
            // usuwa zawartość pliku i nadpisuje od początku
            plikWy = new FileWriter(nazwa);
            // zapis łańcucha
            String tekst = "Dziś jest piękny dzień\nna egzamin z programowania.\n";
            plikWy.write(tekst);
            // zapis po znaku
            for (char z = 'a'; z <= 'z'; z++) {
                plikWy.write(z);
                plikWy.write('\n');
            }

        } finally {
            if (plikWy != null) {
                plikWy.close();
            }
        }
        // teraz zapis przy użyciu klasy PrintWriter, która ma metody znane z
        // System.out
        PrintWriter plik2 = null;
        try {
            // true w konstruktorze FileWriter otwiera plik w trybie dopisywania
            // na końcu
            plik2 = new PrintWriter(new FileWriter(nazwa, true));
            plik2.println("Potęgi liczby 2 <= 1 mln");
            for (int i = 1; i <= 1000000; i *= 2) {
                plik2.format("%6d%n", i);
            }
        } finally {
            if (plik2 != null) {
                plik2.close();
            }
        }
    }

    public static void odczytFormatowany(String nazwa) throws IOException {
        Scanner plikWe = null;
        try {
            // "cebulkowy" sposób tworzenia obiektu klasy Scanner
            // BufferedReader zapewnia efektywny odczyt pliku dzięki
            // odczytowi blokowemu a nie znak po znaku
            plikWe = new Scanner(new BufferedReader(new FileReader(nazwa)));
            // sposób mniej efektywny też działa
            // plikWe = new Scanner(new FileReader(nazwa));

            // wczytaj kolejno wszystkie wyrazy (tokeny) z pliku, zsumuj te które
            // są liczbami całkowitymi
            int suma = 0;
            while (plikWe.hasNext()) { // czy jest coś do odczytu?
                if (plikWe.hasNextInt()) {
                    int l = plikWe.nextInt();
                    suma += l;
                } else {
                    plikWe.next(); // wczytaj kolejny "wyraz", ale nie rób z nim nic
                }
            }
            System.out.format("Suma wczytanych liczb wynosi: %d\n", suma);
        } finally {
            if (plikWe != null) {
                plikWe.close();
            }
        }
    }

    public static boolean czyPlikIstnieje(String nazwa) {
        // Klasa File w Javie służy do reprezentacji i zarządzania ścieżkami do
        // plików i folderów, można jej użyć np. do sprawdzenia, czy dany plik
        // istnieje, jak pokazano poniżej.
        File f = new File(nazwa);
        return f.exists() && f.isFile();
    }

    public static void main(String[] args) throws IOException {
        String nazwaPliku = "test.txt";

        if (czyPlikIstnieje(nazwaPliku)) {
            System.out.println("Plik " + nazwaPliku + " istnieje");
        } else {
            System.out.println("Nie ma pliku o nazwie " + nazwaPliku);
        }

        zapisPliku(nazwaPliku);
        odczytPlikuTekstowego(nazwaPliku);
        odczytFormatowany(nazwaPliku);
    }
}
