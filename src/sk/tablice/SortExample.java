package sk.tablice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Grzegorz Chrzaszczyk on 25-10-2018  09:55 AM
 */
public class SortExample {

    public static void main(String[] args) {

        int[] arr = {13, 7, 6, 45, 21, 9, 102, 100};

        System.out.printf("Initial arr[] =  %s",
                Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.printf("\nAsc arr[] =      %s",
                Arrays.toString(arr));


//        // Sorts arr[] in descending order
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        System.out.printf("Desc arr[] : %s",
//                Arrays.toString(arr));


    }
}