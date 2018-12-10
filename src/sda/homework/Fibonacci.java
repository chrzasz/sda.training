package sda.homework;

import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 15-10-2018  01:37 AM
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 1;
        String str;
        System.out.println("Enter Fibonacci range: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        n = Integer.parseInt(str);

        for (int i = 0; i < n ; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }

        System.out.print("First " + n + " terms: ");

        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + ",");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }

    //Fibonacci Series using Recursion
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }


}
