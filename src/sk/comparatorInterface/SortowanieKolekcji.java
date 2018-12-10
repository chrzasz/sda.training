package sk.comparatorInterface;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  10:19 PM
 */
class Main1 {

    public static void main(String[] args) {

        List<Czlowiek> ludzie = new ArrayList<Czlowiek>();
        ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
        ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
        ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
        ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
        ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
        ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
        ludzie.add(new Czlowiek('K', "Ania", "Daszek"));

        System.out.println("Nieposortowanie: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }

        Collections.sort(ludzie);

        System.out.println("\nPosortowane: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }

        Collections.sort(ludzie, new KomparatorPlec());

        System.out.println("\nPosortowane po plci: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }
    }
}

class KomparatorPlec implements Comparator<Czlowiek> {

    @Override
    public int compare(Czlowiek o1, Czlowiek o2) {
        int plec =  o1.getPlec() - o2.getPlec();
        if(plec == 0) {
            return o1.compareTo(o2);
        }
        return plec;
    }

}

class Czlowiek implements Comparable<Czlowiek>{

    private char plec;
    private String imie;
    private String nazwisko;

    public Czlowiek(char plec, String imie, String nazwisko) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return nazwisko + " " + imie+" (" + plec +")" ;
    }

    @Override
    public int compareTo(Czlowiek o) {
        int porownaneNazwiska = nazwisko.compareTo(o.nazwisko);

        if(porownaneNazwiska == 0) {
            return imie.compareTo(o.imie);
        }
        else {
            return porownaneNazwiska;
        }
    }

    public char getPlec() {
        return plec;
    }

}




