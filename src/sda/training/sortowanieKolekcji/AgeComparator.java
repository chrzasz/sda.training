package sda.training.sortowanieKolekcji;

import java.util.Comparator;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  02:51 PM
 */
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        //comparator zwraca:
        // < 0 gdy obiekt1 < obiekt2
        // = 0 gdy obiekty takie same
        // > 0 gdy obiekt1 > obiekt2
        return p1.getAge() - p2.getAge();
    }



}
