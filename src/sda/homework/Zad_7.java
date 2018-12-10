package sda.homework;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  10:32 PM
 */
public class Zad_7 {

    public static void main(String[] args) {

        // 7. Napisz program który wczyta tekst i wypisze go używając
        // wyłącznie wielkich liter.
        // 7.1. Zmodyfikuj program tak by po wypisaniu wejściu pozwolił
        // wprowadzić kolejne słowa dopóki użytkownik nie poda "q!"

        Scanner sc = new Scanner(System.in);

        System.out.print("Type any text: ");
        String input = sc.nextLine();


        System.out.println("UPPER CASE: " + input.toUpperCase());

        System.out.print("Type any text (type: q! - to exit) ");

        String input1 = "";
        while (!input1.startsWith("q!")) {
            input1 = sc.nextLine();

        }
        System.out.println("escape : " + input1.trim());


    }
}
