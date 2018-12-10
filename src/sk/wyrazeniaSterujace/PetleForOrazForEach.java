package sk.wyrazeniaSterujace;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  12:38 AM
 */
public class PetleForOrazForEach {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " jest liczba parzysta.");
            } else {
                System.out.println(i + " jest liczba nieparzysta.");
            }
        }

        for (int i = 0, j = 10; i <= j; i++, j--) {

            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i + ", j = " + j);
        }

        int[][] tablica = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for (int[] x: tablica) {
            for (int y: x) {
                System.out.println("Pojedyncze elementy = " + y);
            }
        }
    }
}
