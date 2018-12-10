package sda.homework;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  11:35 PM
 */
public class ConsoleStars {

    /*
     * 9. Napisz program który wyświetli kwadrat z znaków * o boku 3
     * 9.1. Zmodyfikuj program tak by długość boku była wczytywana z wejścia
     */

    public static void main(String args[]) throws IOException {

        Scanner num = new Scanner(System.in);
        System.out.println("type size of your square: ");
        int size = num.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }

    }

}
