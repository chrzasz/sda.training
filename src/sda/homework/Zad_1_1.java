package sda.homework;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  09:46 PM
 */
public class Zad_1_1 {

    public static void main(String[] args) {
        // ZAD 1 Napisz program który obliczy sumę dwóch liczb
        //   1.1. liczb podanych przez użytkownika w konsoli


        int a = 0;
        int b = 0;

        System.out.println("--- ZAD 1.1 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        a = scanner.nextInt();
        System.out.print("Enter seconf number:");
        b = scanner.nextInt();
        System.out.println("Sum a + b = " + sum(a, b));

        System.out.println("--- ZAD 1.2 ---");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Input parameter " + (i + 1) + " : " + args[i]);
        }

        if (args.length >= 2) {
            for (int i = 0; i < args.length; i++) {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
        }
        System.out.println("Sum from input arguments arg1 + arg2 = " + (a + b));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
