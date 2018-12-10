package sda.training.algorytmy;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class BubbleSortOwn {

    private int[] arr ;//= new int[8];

    public BubbleSortOwn() {
    }

    public BubbleSortOwn(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void putValueArr(int idx, int value) {
        this.arr[idx] = value;
    }

    public int getArrLength() {
        return this.arr.length;
    }



    public void sort(int[] arr) {

        boolean swapped;

        do {
            swapped = false;

            int indexOfLastUnsortedElement = arr.length;

            for (int i = 0; i < (indexOfLastUnsortedElement-1); i++) {

                int leftElement = arr[i];
                int rightElement = arr[i+1];

                if ( leftElement > rightElement ) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }

        } while (swapped);

//        return arr;
    }


    public static void main(String[] args) {

        BubbleSortOwn bubbleSort = new BubbleSortOwn();

        bubbleSort.setArr( new int[]{13, 7, 6, 45, 21, 9, 102, 100} );

        System.out.printf("Initial arr[] =  %s", Arrays.toString(bubbleSort.arr));

        bubbleSort.sort(bubbleSort.getArr()); // sortujemy

        System.out.printf("\nSorted arr[] =  %s", Arrays.toString(bubbleSort.getArr()));

        // generator liczb losowych
        Date d = new Date();
        Random rnd = new Random(d.getTime());

        // wypelnianie tablicy losowymi wartosciami
        for (int i = 0; i < bubbleSort.arr.length; i++) {
            bubbleSort.arr[i] = rnd.nextInt(110);
        }
        System.out.printf("\nRandom arr[] =  %s", Arrays.toString(bubbleSort.arr));

        bubbleSort.sort(bubbleSort.getArr()); // sortujemy

        System.out.printf("\nSorted arr[] =  %s", Arrays.toString(bubbleSort.getArr()));

    }
//
//    public static void swap(int leftElement, int rightElement) {
//        int temp;
//        for (int i = 0; i < ; i++) {
//
//        }
//
//    }


}
