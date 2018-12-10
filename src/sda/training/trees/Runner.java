package sda.training.trees;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by Grzegorz Chrzaszczyk on 28-10-2018  11:46 AM
 */
public class Runner {

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i+=100) {
            runOneTest(i);
        }

    }


    public static void runOneTest(int sizeOfArray) {

        int[] array = new int[sizeOfArray];

        Date d = new Date();
        Random rnd = new Random(d.getTime());

        randomlyFillArray(array);

        int toBeFound = rnd.nextInt();

        long elapsedForArray = measureArray(array, toBeFound);
        long elapsedForBst = measureBst(array, toBeFound);
        System.out.println(array.length + "\t" + elapsedForArray + "\t" + elapsedForBst);

    }

    private static long measureArray(int[] array, int toBeFound) {

        long startTime = System.nanoTime();
        boolean result = contains(array, toBeFound);
        long endTime = System.nanoTime();
        long elapsed = (endTime - startTime);

        return elapsed;

    }

    static long measureBst(int[] array, int toBeFound) {

        // jeżeli array jest typu int[] musimy zmienić tablicę na Integer[] w ten sposób
        Integer[] boxedArray = Arrays
                .stream(array)
                .boxed()
                .toArray(Integer[]::new);

        SdaBstImpl tree = new SdaBstImpl(boxedArray);

        long start = System.nanoTime();
        // tak sprawdzamy czy element istnieje w BST
        boolean result = tree.contains(toBeFound);
        long end = System.nanoTime();
        long elapsed = end - start;
        return elapsed;
    }

    static boolean contains(int[] array, int toBeFound) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == toBeFound) {
                return true;
            }
        }
        return false;
    }


    public static void randomlyFillArray(int[] array) {

        Date d = new Date();
        Random rnd = new Random(d.getTime());

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
    }



}
