package sda.homework;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  09:50 PM
 */
public class Zad_1_2 {

    public static void main(String[] args) {
        // ZAD 1 Napisz program który obliczy sumę dwóch liczb
        //   1.2. podanych jako argumenty wejściowe programu String[] args
        // Menu Run->Edit configuration -> Program arguments

        int a = 0;
        int b = 0;


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

}
