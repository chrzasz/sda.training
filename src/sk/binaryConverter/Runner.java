package sk.binaryConverter;

/**
 * Created by Grzegorz Chrzaszczyk on 12-10-2018  10:06 PM
 */
public class Runner {


    public static void main(String[] args) {

        int x = 1234;

        BinaryConverter bc = new BinaryConverter();

        System.out.println("my intToBinString function:");
        bc._intToBinString(x);

        System.out.println("\nInteger.toBinaryString:");
        System.out.println(Integer.toBinaryString(x));





        System.out.println("\n" + x + " % 2 = " + x % 2);
        System.out.println(bc.intToBinary(1234));

    }
}
