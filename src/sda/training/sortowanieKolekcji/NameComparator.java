package sda.training.sortowanieKolekcji;

import java.util.Comparator;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  03:28 PM
 */
public class NameComparator implements Comparator<Person> {


    @Override
    public int compare(Person name1, Person name2) {

        if (name1.getName() == name2.getName()) {
            return 0;
        }
        if (name1.getName() == null) {
            return -1;
        }
        if (name2.getName() == null) {
            return 1;
        }
        return name1.getName().compareTo(name2.getName());
    }
}
