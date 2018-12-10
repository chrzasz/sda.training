package sda.training.kopiec;

import sda.training.trees.*;

import java.util.Random;

/**
 * Created by Grzegorz Chrzaszczyk on 21-10-2018  02:05 PM
 */
public class MainHeap {
    public static void main(String[] args) {

        Integer idx = 1;
        Integer swa = 2;

        Random rand = new Random();


        SdaHeapImpl heap = new SdaHeapImpl();

//        for (int i = 0; i < 4; i++) {
//            int  n = rand.nextInt(50) + 1; //50 is the maximum and the 1 is our minimum
//            heap.push(n);
//        }


        heap.push(17);
        heap.push(19);
        heap.push(36);
        heap.push(100);

//        System.out.println(heap.size());





    }


}
