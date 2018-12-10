package sk.tablice;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 16-09-2018  03:40 PM
 */
public class ArrayTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size :");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        int size = array.length;

        for (int i = 0; i < size; i++) {
            array[i] = i;
            System.out.print(array[i]);
            System.out.print(";");
        }


    }

}



