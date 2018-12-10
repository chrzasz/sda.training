package sk.tablice;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 28-08-2018  10:50 PM
 */
public class TabliceJednowymiarowe {

    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = array.length;
        //int x = tablica[5];

        //tablica[0] = 10;

        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + i + " :");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            System.out.print(";");
        }

    }
}