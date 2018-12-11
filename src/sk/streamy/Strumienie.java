package sk.streamy;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Grzegorz Chrzaszczyk on 11-12-2018  10:53 PM
 */
public class Strumienie {
    public static void main(String[] args) {

        // Utworzenie setu danych
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt());
        }

        // 1. tradycyjne podejscie
        long start = System.currentTimeMillis();
        int result = 0;
        for (int i : arrayList) {
            result += isPrime(i);
        }
        long end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers, " + result + " are prime.");
        System.out.println("Execution time = " + end + "[ms]");

        // 2. strumien

        System.out.println("\n========================================================");
        start = System.currentTimeMillis();
        result = arrayList.stream().map(Strumienie::isPrime).reduce(Integer::sum).get();
        end = System.currentTimeMillis() - start;
        System.out.println("From 100 numbers, " + result + " are prime.");
        System.out.println("Execution time = " + end + "[ms]");

        // 2. strumien rownolegly

        System.out.println("\n========================================================");
        start = System.currentTimeMillis();
        result = arrayList.parallelStream().map(Strumienie::isPrime).reduce(Integer::sum).get();
        end = System.currentTimeMillis() - start;
        System.out.println("From 100 numbers, " + result + " are prime.");
        System.out.println("Execution time = " + end + "[ms]");
    }

    public static int isPrime(int n) {
        n = Math.abs(n);
        for (int i = 2; i < n; i++) if (n % i == 0) return 0;
        return 1;
    }

}
