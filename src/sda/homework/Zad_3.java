package sda.homework;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  10:06 PM
 */
public class Zad_3 {

    public static void main(String[] args) {

        // ZAD 3.1 Napisz program który obliczy iteracyjnie silnie liczby N.

        Scanner scanner = new Scanner(System.in);
        Silnia silnia = new Silnia(0);

        System.out.println("Podaj dla jakiej liczby obliczyc silnie iteracyjnie.");
        silnia.i = scanner.nextInt();
        silnia.silniaIter(silnia.i);
        System.out.println(silnia.i + "! = " + silnia.silnia );


        // ZAD 3.2 Napisz program który obliczy rekurencyjny silnie liczby N.

        System.out.println("Podaj dla jakiej liczby obliczyc silnie rekurencyjnie.");
        silnia.i = scanner.nextInt();
        System.out.println(silnia.i + "! = " +  silnia.silniaRecur(silnia.i));




    }
}
