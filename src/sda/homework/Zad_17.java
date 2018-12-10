package sda.homework;

import java.util.Arrays;

/**
 * Created by Grzegorz Chrzaszczyk on 25-10-2018  09:08 AM
 */
public class Zad_17 {
    /*
     * 17. Napisz program który sprawdzi czy dwa podane wyrazy są anagramami.
     * 17.1. Zmodyfikuj program tak by słowa do sprawdzenia wczytał z pliku. Nadal będą to tylko 2 słowa oddzielone znakiem nowej lini
     * 17.2. Zmodyfikuj program tak by znalazł wszystkie anagramy dla słów z pliku oddzielonych znakiem nowej lini.
     * Do ostatecznego przetestowania programu użyj listy słów: http://codekata.com/data/wordlist.txt (do znalezienia jest 20683 anagramów)
     */

    public static void main(String[] args) {

        String str1 = "ABBA";
        String str2 = "BABA";

        System.out.println(str1 + " & " + str2 + " are anagrams? = " +
                areAnagram(str1,str2));

    }

    static boolean areAnagram(String str1, String str2) {

        // Get lenghts of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
        else {
            // convert input string to char array
            char tempArray1[] = str1.toCharArray();
            char tempArray2[] = str2.toCharArray();

            // sort tempArrays
            Arrays.sort(tempArray1);
            Arrays.sort(tempArray2);

            // Compare sorted strings
            for (int i = 0; i < n1; i++)
                if (tempArray1[i] != tempArray2[i])
                    return false;

            return true;
        }


    }
}
