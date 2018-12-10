package sda.training.algorytmy;

import java.util.Arrays;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  10:51 AM
 */
public class InsertionSortOwn {

    private int[] arr;

    public InsertionSortOwn() {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void sortDSC(int[] a) {
        int i, j, temp;
        for (i = 1; i < a.length; i++) {
            j = i - 1;
            while (j >= 0 && a[j] < a[i]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i = j;
                j--;

            }
        }
    }

    public void sortASC(int[] arr) {

        int i, j, temp;
        for (i = 1; i < arr.length; i++) {
            j = i - 1;
            while (j >= 0 && arr[j] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = j;
                j--;
            }
        }
    }

    public void sort(int[] arr) {

        //mark first element as sorted
        int lastSortedIdx = 0;

        while (lastSortedIdx <= arr.length-1) {
            //Extract the first unsorted element
            int firstUnsortedIdx = lastSortedIdx + 1;

            //Figure where to insert extracted element;
            // comparing with sorted element
            for (int i = firstUnsortedIdx; i >= 0; i--) {


                //if current element j > X

                if (arr[lastSortedIdx] > arr[firstUnsortedIdx]) {
                    //move sorted element to the right by 1
                    int temp;
                    temp = arr[lastSortedIdx];
                    arr[lastSortedIdx] = arr[firstUnsortedIdx];
                    arr[firstUnsortedIdx] = temp;
                    lastSortedIdx++;


                } else break;

            }
        }

    } // END sort

    public static void main(String[] args) {

        InsertionSortOwn insSort = new InsertionSortOwn();

        insSort.setArr(new int[]{13, 7, 6, 45, 21, 9, 49, 33});

        System.out.printf("Initial arr[] =  %s", Arrays.toString(insSort.arr));

        insSort.sort(insSort.getArr()); // sortujemy

        System.out.printf("\nSorted  arr[] =  %s", Arrays.toString(insSort.getArr()));


    }
}

