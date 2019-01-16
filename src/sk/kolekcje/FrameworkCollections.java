package sk.kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class FrameworkCollections {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(0, 20);

        for (int i : arrayList) {
            System.out.println(i);
        }

        int x = arrayList.get(0);

        arrayList.remove(1);

        //jak dodajemy lub usuwamy to szybsza jest LinkedList ale wolniej sie dostaje do elementow wewnatrz listy

        //HashMap

        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(0, "Ala");
        hashmap.put(3, "ma");
        hashmap.put(9, "kota");
        hashmap.put(100, "!");

        System.out.println(hashmap.get(9));

        //kopia wartosci mapy do listy

        ArrayList<String> mapList = new ArrayList<>(hashmap.values());

        Collections.shuffle(mapList);

        for (String s : mapList) {
            System.out.println(s);
        }


    }
}

