package sda.homework;

import sda.homework.ParseArguments;
import sda.homework.Silnia;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  09:55 PM
 */
public class Zad_2 {

    public static void main(String[] args) {
        // ZAD 2 Napisz program który dla liczby N obliczy sumę wszystkich wielokrotności 3 i 5 które są <= N (mniejsze lub równe)
        // Menu Run->Edit configuration -> Program arguments

        System.out.println("--- ZAD 2 ---");

        ParseArguments arguments = new ParseArguments(args);
        System.out.println("Suma wielokrotnosci 3 i 5 z klasy ParseArguments: " + wielokrotnosciZad2(arguments.getIntArg1(args)));

        if (args.length > 0) {
            System.out.println("Suma wielokrotnosci 3 i 5 z arg1=" + args[0] + " : " + wielokrotnosciZad2(Integer.parseInt(args[0])));
        }


        Silnia silnia = new Silnia(0);
    }

    public static int wielokrotnosciZad2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

}
