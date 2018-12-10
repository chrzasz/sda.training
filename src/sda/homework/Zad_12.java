package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 25-10-2018  06:43 AM
 */
public class Zad_12 {
    //* 12. Napisz program który podaną liczbę wejściową wyświetli w postaci binarnej
    // (system dwójkowy)

    public static void main(String[] args) throws Exception {

        String intStr = "101";
        System.out.println(intStr+ " = "+Integer.toBinaryString(Integer.parseInt(intStr)));


        for (int i = 0; i < 50; i++) {
            System.out.println(Integer.toBinaryString(i).toString());
        }



    }


}
