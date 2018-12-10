package sda.training.algorytmy;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by Grzegorz Chrzaszczyk on 28-10-2018  10:26 AM
 */
public class TimeTest {

    public static void main(String[] args) {

        int sizeOfArray = 3;
        int noOfIterations = 3;

        Date d = new Date();
        Random rnd = new Random(d.getTime());

        for (int i = 1; i < noOfIterations; i++) {

            int[] tempArr = new int[sizeOfArray * noOfIterations];

            // wypelnianie tablicy losowymi wartosciami
            for (int j = 0; j < (tempArr.length); j++) {
                tempArr[j] = rnd.nextInt(110);
            }

            BubbleSortOwn bs = new BubbleSortOwn();
            bs.setArr(tempArr);
            long startTieme = System.nanoTime();
            bs.sort(bs.getArr()); // sortujemy
            long endTime = System.nanoTime();
            System.out.println("SIZE:" + tempArr.length+ "\t Elapsed sorting time [ms]: " + (endTime - startTieme) / 1000);

        }


//        System.out.printf("Initial arr[] =  %s", Arrays.toString(arr));


    }
}
