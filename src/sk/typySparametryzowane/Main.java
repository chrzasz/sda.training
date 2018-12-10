package sk.typySparametryzowane;

import java.util.ArrayList;

/**
 * Created by Grzegorz Chrzaszczyk on 10-12-2018  10:31 PM
 */
public class Main {
    public static void main(String[] args) {

        ArrayList arrayList_1 = new ArrayList(); // objects of class Object

        arrayList_1.add(1);
        arrayList_1.add(1.2345);
        arrayList_1.add("Nietoperz");

        String zwierze = (String) arrayList_1.get(2);

        System.out.println(zwierze);

        for (Object str : arrayList_1) {
            System.out.println(str);
        }

        //Typy sparametryzowane only in Java > 5 ! - nie moze byc typ prosty
        ArrayList<String> arrayList_2 = new ArrayList<>();
        arrayList_2.add("Element1 string only");
        arrayList_2.add("Element2 string only");
        arrayList_2.add("Element3 string only");

        for (String str : arrayList_2) {
            System.out.println(str);
        }





    }
}
