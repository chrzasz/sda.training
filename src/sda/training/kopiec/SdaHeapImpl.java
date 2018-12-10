package sda.training.kopiec;

import java.util.ArrayList;
import java.util.List;

/*
A Binary Heap is a Complete Binary Tree. A binary heap is typically represented as an array.

The root element will be at Arr[0].
Below table shows indexes of other nodes for the ith node, i.e., Arr[i]:
Arr[(i-1)/2]	Returns the parent node
Arr[(2*i)+1]	Returns the left child node
Arr[(2*i)+2]	Returns the right child node

 */
public class SdaHeapImpl implements SdaHeap {

    private static int sizeOfArray = 4;
    private static Integer[] heapArray = new Integer[sizeOfArray];
//    private List<Integer> heapList;


    @Override
    public void push(Integer element) {

        int indexForNewElement = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            if (heapArray[i] == null) {
                indexForNewElement = i;
                break;
            }
        }
        heapArray[indexForNewElement] = element;

        int indexOfParent = (indexForNewElement - 1) / 2;
        Integer parent = heapArray[indexOfParent];
        showConsole();
        System.out.println("");
        if ((parent != null) && (element > parent)) {
            Integer temp = heapArray[indexOfParent];
            heapArray[indexOfParent] = element;
            heapArray[indexForNewElement] = temp;
            indexForNewElement = indexOfParent;
            indexOfParent = (indexForNewElement - 1) / 2;
        }

        showConsole();
        System.out.println("");



    }



    public void showConsole() {
//        for (int i = 0; i < sizeOfArray; i++) {
//            if (heapArray[i] != null) {
//                System.out.print(heapArray[i]);
//            }
//            if (i != sizeOfArray - 1) System.out.print(" , ");
//        }
        int i = 0;
        while (true) {

            if (heapArray[i] == null) break;
            System.out.print(heapArray[i]);
            if (i != sizeOfArray - 1) System.out.print(" , ");
            i++;
            if (i >= sizeOfArray) break;
        }
    }

    @Override
    public Integer pop() {

        return null;
    }

    @Override
    public int size() {

        return -1;
    }

    @Override
    public Integer[] toArray() {

        return new Integer[0];
    }
}
