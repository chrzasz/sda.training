package sk.binaryConverter;

/**
 * Created by Grzegorz Chrzaszczyk on 12-10-2018  10:02 PM
 */
public class BinaryConverter {


    public void _intToBinString(int number) {

//        while (number > 0) {
//            if (number % 2 == 0) System.out.print("0");
//            else System.out.print("1");
//            number /= 2;
//        }

        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            if ((number & 1) == 1) {
                binary.append(1);
            } else
                binary.append(0);
            number >>= 1;
        }
        System.out.println(binary.reverse());

    }

    public static String intToBinary(int n) {
        String s = "";
        while (n > 0) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        return s;
    }


}
