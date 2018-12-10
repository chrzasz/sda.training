package sk.typySparametryzowane;

/**
 * Created by Grzegorz Chrzaszczyk on 10-12-2018  10:56 PM
 */

// parametryzacja metod

public class Main3 {
    public static void main(String[] args) {

        Integer[] tablicaLiczb = {1,2,3,4,5};
        Character[] tablicaZnakow = {'a','b','c','d','e'};

        wyswietlElementyTablicy(tablicaLiczb);
        wyswietlElementyTablicy(tablicaZnakow);
    }

//    private static void wyswietlElementyTablicy(Integer[] tablicaLiczb) {
//        for (Integer e: tablicaLiczb) {
//            System.out.print(e);
//        }
//        System.out.println();
//    }
//
//    private static void wyswietlElementyTablicy(Character[] tablicaLiczb) {
//        for (Character e: tablicaLiczb) {
//            System.out.print(e);
//        }
//        System.out.println();
//    }

    // metoda generyczna - przed typem zwracanym przez metode dajemy <TYP> oraz przed parametrami
    private static <T> void wyswietlElementyTablicy(T[] tablicaLiczb) {
        for (T e: tablicaLiczb) {
            System.out.print(e);
        }
        System.out.println();
    }


}
