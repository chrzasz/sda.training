package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 25-10-2018  06:07 AM
 */
public class Zad_10 {
    //10. Napisz program który sprawdzi czy słowo jest palindormem

    public static void main(String[] args) {

        String in1 = "ABCDCBA";
        String in2 = "Ala";
        String in3 = "AbbCcbba";

        System.out.println(in1 + " " + isPalindrome(in1, false));
        System.out.println(in2 + " " + isPalindrome(in2, false));
        System.out.println(in2 + " " + isPalindrome(in2, true));
        System.out.println(in3 + " " + isPalindrome(in3, false));
        System.out.println(in3 + " " + isPalindrome(in3, true));
    }

    public static boolean isPalindrome(String str, boolean caseSens) {
        str.trim();
        char[] array;
        if (caseSens) {
            array = str.toUpperCase().toCharArray();
        } else
            array = str.toCharArray();

        // Start from leftmost and rightmost corners of str
        int l = 0;
        int h = str.length() - 1;

        // Keep comparing characters while they are same
        while (h > l) {
            if (array[l++] != array[h--]) return false;

        }
        return true;
    }

}
