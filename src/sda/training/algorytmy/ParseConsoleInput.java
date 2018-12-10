package sda.training.algorytmy;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 18-10-2018  10:45 PM
 */
public class ParseConsoleInput {
    // ZAD 7. Napisz program który wczyta tekst i wypisze go używając wyłącznie wielkich liter.
    // ZAD 7..1. Zmodyfikuj program z punktu 2 tak by po wypisaniu wejściu
    // pozwolił wprowadzić kolejne słowa dopuki użytkownik nie poda "q!"

    private String input;
    private String output;


    public ParseConsoleInput(String input) {
    }

    public ParseConsoleInput() {
    }

    public String getOtput() {
        output = input.toUpperCase();
        return output;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void checkESC(String input) {

    }

    public static void main(String[] args) {

        String delim="!q";

        ParseConsoleInput prsIn = new ParseConsoleInput();

        Scanner console = new Scanner(System.in);
        System.out.print("Enter any text ( !q - quit): ");
do {

} while (delim.equalsIgnoreCase(delim));
        String str = console.next();
        prsIn.setInput(str);
        System.out.println(prsIn.getOtput());


    }

}
