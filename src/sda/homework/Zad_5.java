package sda.homework;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  10:27 PM
 */
public class Zad_5 {

    public static void main(String[] args) {

        //  ZAD 5. Napisz program który obliczy średnią liczb podanych na wejściu.

        System.out.println("--- ZAD 5 ---");

        Scanner console = new Scanner(System.in);

        int count = 0;
        int num = 0;
        double average = 0.0;
        int sum = 0;

        do {
            System.out.print("Enter number " + ++count + " (type 0 to exit) : ");
            num = console.nextInt();
            sum += num;
        }while (num != 0);

        if ((count-1)!=0)    average = sum / (count-1);
        System.out.println("The average of the numbers is: " + sum + "/" + (count-1) + " = " + average);

    }
}
