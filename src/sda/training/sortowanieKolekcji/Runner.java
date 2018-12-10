package sda.training.sortowanieKolekcji;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Runner main = new Runner();
        main.program();
    }//END main


    private void program() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", 23));
        people.add(new Person("Gal ", 99));
        people.add(new Person("Ania", 41));
        people.add(new Person("Ania", 33));
        people.add(new Person("Zeto", 26));
        people.add(new Person("Asia", 23));
        people.add(new Person("Asia", 11));
        people.add(new Person("Guto", 11));

        System.out.println("Nieposortowanie:\t vvvvvvvvvvvvvv");
        for (Person p : people) {
            System.out.println(p);
        }


        System.out.println();
        AgeComparator comparator = new AgeComparator();

        //ponizej rozne motedy compare
        Collections.sort(people, comparator); //wlasna metoda
//        Collections.sort(people, (a, b) -> a.getAge()- b.getAge()); //wyrazenie labda
//        Collections.sort(people, Comparator.comparingInt(u -> u.getAge())); //wbudowane funkcje compare

        System.out.println("Posortowane osoby wg wieku: vvvvvvvvvvvvvv");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();

//        int[] ints = {1, 2, 3, 10, 1, 2, 3};
//        Arrays.sort(ints);
//        for (int i : ints) {
//            System.out.print(i + ",");
//
//        }

        NameComparator byNames = new NameComparator();
        Collections.sort(people, byNames);
        System.out.println("Posortowane osoby wg imienia: vvvvvvvvvvvvvv");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();

    }// END method program()


}//END class Runner

