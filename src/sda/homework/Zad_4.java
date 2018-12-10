package sda.homework;

/**
 * Created by Grzegorz Chrzaszczyk on 24-10-2018  10:20 PM
 */
public class Zad_4 {

    public static void main(String[] args) {
        //  ZAD 4. Napisz program który wypisze od tyłu tekst podany na wejściu.

        System.out.println("--- ZAD 4 ---");
        InvertInputText invTxt = new InvertInputText("");

        String str1="TEST 1234";
        System.out.println(invTxt.invertTxt(str1));

        String str2="programuje w javie";

        System.out.println(invTxt.invertTxt(str2));



        // z klasy ReverseString

        ReverseString rs1 = new ReverseString("TEST 1234");
        ReverseString rs2 = new ReverseString("programuje w javie");

        System.out.println("INPUT: " + rs1.getInput());

        System.out.println("OUTPUT: " + rs1.getOutput());

        System.out.println("INPUT: " + rs2.getInput());

        System.out.println("OUTPUT: " + rs2.getOutput());



    }
}
