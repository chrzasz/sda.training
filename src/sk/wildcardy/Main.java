package sk.wildcardy;

import java.util.ArrayList;

/**
 * Created by Grzegorz Chrzaszczyk on 10-12-2018  11:17 PM
 */
public class Main {
    public static void main(String[] args) {

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Jeden");
//        wyswietlElement(0, arrayList);

        ArrayList<Maszyna> arrayList = new ArrayList<>();
        arrayList.add(new Maszyna());
        wyswietlElement(0, arrayList);



    }

//    private static <T> void wyswietlElement(int i, ArrayList<T> arrayList) {
//
//        T e = arrayList.get(i);
//        System.out.println("Element: " + e);
//        System.out.println("Typ elementu: " + e.getClass().getName());
//
//    }

    // wildcardy - argument wieloznaczny to: ?
    // suzy do ograniczenia typow
    // ? extends ClassName - typy z klasy oraz klas dziedziczacych
    // ? super ClassName - typy z ograniczeniem do klasy ClassName
    private static <T extends Maszyna> void wyswietlElement(int i, ArrayList<?> arrayList) {

        Object e = arrayList.get(i);
        System.out.println("Element: " + e);
        System.out.println("Typ elementu: " + e.getClass().getName());

    }

}


class Maszyna {


}

class Robots extends Maszyna {

}