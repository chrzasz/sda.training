package sda.homework;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  10:49 PM
 */
public class Zad_8 {
    /*
     * 8. Napisz program który jako argument wejściowy przyjmie liczy oddzielone spacjami:
     * 8.1. wszystkie liczy w kolejności w jakiej zostały podane
     * 8.2. wszystkie liczby od tyłu
     * 8.3. wszystkie na nieparzystych pozycjach
     * 8.4. wszystkie podzielen przez 3
     * 8.5. sumę wszystkich
     * 8.6. sumę pierwszych 4
     * 8.7. sumę ostatnich 5 liczb które są większe niż 2
     * 8.8. wypisz sumę liczb od początku tablicy która przekaracza 10 (in: "1 2 3 5 6 7 10 100 123" out: "11")
     * 8.9. (zadanie domowe) wybierz liczby z tablicy tak by ich suma była jak najbliższa 10, wypisz te liczby
     * 8.10. (zadanie domowe) wybierz liczby z tablicy tak by ich suma była jak najbliższa N, wypisz te liczby
     * wejście będzie podane w formie: "N 1 2 13 100 4 10..."
     */

    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);

        Integer[] params = new Integer[16];

        String parStr;
        System.out.print("Type int parameters (space = delim): ");
        parStr = console.nextLine();

        System.out.println("Input string: " + parStr);

        String[] splited = parStr.trim().split(" ");

        try {
            for (int i = 0; i < splited.length; i++) {
                System.out.println("Splitted " + i + " : " + splited[i]);
            }




        } catch (Exception e) {
            System.out.println("I could not understand that, you sure \"" + parStr + "\" is valid?");
            System.out.println("I'll let you try again");
            main(args);

        }
    }
}

