package sk.tablice;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  11:02 PM
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sumArray(numbers));
    }

    private static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
