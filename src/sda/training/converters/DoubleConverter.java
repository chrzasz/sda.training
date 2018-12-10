package sda.training.converters;

/**
 * Created by Grzegorz Chrzaszczyk on 16-09-2018  10:02 AM
 */
public class DoubleConverter {
    public static void main(String[] args) {
        double number1 = 5.50d;
        int number2 = 2;
        int number3 = (int)number1/number2;
        System.out.println(number3);
        var number4 = number1/number2;
        System.out.println(number4);

        float floatNumber = 0x1.90a3d8p4f;
        long longNumber = 234234L;
        int int1 = 1_000_000;
        int int2 = 10;
        byte byte1 = 22;
        double doublePi = 3.14159;
        char charA = 'A';

        System.out.println(floatNumber*longNumber);
        System.out.println(floatNumber/longNumber);
        System.out.println(int1/longNumber);
        System.out.println(int1+charA);

    }

}