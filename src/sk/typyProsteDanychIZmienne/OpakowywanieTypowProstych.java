package sk.typyProsteDanychIZmienne;

/**
 * Created by Grzegorz Chrzaszczyk on 28-08-2018  10:28 PM
 */
public class OpakowywanieTypowProstych {

    public static void main(String[] args) {

        // Byte, Short, Integer, Long, Float, Double, Character i Boolean.

        int x = 10;
        Integer integer = x;

        int compare = integer.compareTo(15);

        System.out.println(compare);

        int y = integer;
        System.out.println(y);


    }
}
