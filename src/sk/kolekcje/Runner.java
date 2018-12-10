package sk.kolekcje;

import java.util.*;

/**
 * Created by Grzegorz Chrzaszczyk on 13-10-2018  12:10 AM
 */
public class Runner {

    // Kolekcja = sposób grupowania obiektów
    // 1. List - interface, klasy: LinkedList , ArrayList
    //LinkedList lepiej jest używać jeśli często usuwasz elementy z listy, a ArrayList lepiej jest używać jeśli często chcesz mieć dostęp do losowych elementów w liście
    // 2. Set - służy do przechowywania unikalnych elementów
    // 3. Map - pozwala przechować odwzorowanie zbioru kluczy na listę wartości


    public static void main(String[] args) {


        System.out.println(">>>>>> List:");
        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");

        List<String> otherListWithNames = new LinkedList<>();
        otherListWithNames.add("Marek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Marek");

        System.out.println(otherListWithNames.contains("Marek"));
        System.out.println(otherListWithNames.get(0));
        System.out.println(otherListWithNames.isEmpty());
        System.out.println(otherListWithNames.indexOf("Marek"));
        System.out.println(otherListWithNames.lastIndexOf("Marek"));


        List<String> sampleList = new ArrayList<>();
        sampleList.add("Marcin");
        sampleList.add("Adela");
        sampleList.add("Marek");
        sampleList.add("Magda");

        System.out.println("Iterowanie po liscie (foreach)");
        for (String item : sampleList) {
            System.out.println(item);
        }

        System.out.println("Iterowanie po liscie (for)");
        for (int index = 0; index < sampleList.size(); index++) {
            System.out.println(sampleList.get(index));
        }

        //----------------------------------------------------------------------
        System.out.println("\n>>>>>> Set:");
        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Marcin");
        setWithNames.add("Marek");
        setWithNames.add("Marcin");

        Set<String> otherSet = new HashSet<>();
        otherSet.add("Zenon");
        otherSet.add("Marek");

        setWithNames.addAll(otherSet);

        System.out.println(setWithNames.isEmpty());
        System.out.println(setWithNames.size());
        System.out.println(setWithNames.contains("Marcin"));
        System.out.println(setWithNames.remove("Janusz"));

        Set<String> sampleSet = new HashSet<>();
        sampleSet.add("Marcin");
        sampleSet.add("Adela");
        sampleSet.add("Marek");
        sampleSet.add("Magda");

        System.out.println("Iterowanie po zbiorze");
        for(String item : sampleSet) {
            System.out.println(item);
        }



        //----------------------------------------------------------------------
        System.out.println("\n>>>>>> Map:");
        Map<String, String> pairsMap = new HashMap<>();
        pairsMap.put("Marcin", "Adela");
        pairsMap.put("Marek", "Magda");

        Map<String, String> otherPairsMap = new HashMap<>();
        otherPairsMap.put("Marek", "Ewa");
        otherPairsMap.put("Adam", "Ewa");

        pairsMap.putAll(otherPairsMap);

        System.out.println(pairsMap.get("Marek"));
        System.out.println(pairsMap.remove("Marek"));
        System.out.println(pairsMap.size());
        System.out.println(pairsMap.isEmpty());
        System.out.println(pairsMap.containsKey("Jan"));
        System.out.println(pairsMap.containsValue("Adela"));


        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Marek", "Magda");
        sampleMap.put("Marcin", "Adela");

        System.out.println("Iterowanie po wartosciach");
        for(String value : sampleMap.values()) {
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartosci");
        for(String key : sampleMap.keySet()) {
            String value = sampleMap.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("Iterowanie po kluczach i wartosciach");
        for(Map.Entry<String, String> entry : sampleMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("pierwszy", 1);
        mapa.put("drugi", 2);
        System.out.println(mapa.get("pierwszy")); //wypisze "1"
    }
}
