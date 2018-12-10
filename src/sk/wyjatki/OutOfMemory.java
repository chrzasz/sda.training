package sk.wyjatki;

/**
 * Created by Grzegorz Chrzaszczyk on 12-10-2018  09:42 PM
 */
public class OutOfMemory {


    public static void main(String[] args) {

        int[] arr = new int[Integer.MAX_VALUE];


        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            arr[0] = i;
        }

        System.out.println(Long.MAX_VALUE);
    }


}
