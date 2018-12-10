package sda.training.streamy;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

import java.util.Optional;
import java.util.function.*;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  11:33 AM
 */
public class Runner {
    public static void main(String[] args) {

        List<User> ludzie = new ArrayList<>();

        User u1 = new User("Jan", "Kowalski",
                LocalDate.of(1985, 2, 20),
                3500.0,
                User.CIVIC_STATE.FREE,
                1);

        User u2 = new User("Julia", "Konradcka",
                LocalDate.of(1987, 3, 20),
                10000.0,
                User.CIVIC_STATE.TAKEN,
                2);

        User u3 = new User("Konrad", "Karwowski",
                LocalDate.of(1992, 10, 22),
                2500.0,
                User.CIVIC_STATE.FREE,
                0);

        User u4 = new User("Norbert", "Urbanski",
                LocalDate.of(1972, 5, 6),
                7500.0,
                User.CIVIC_STATE.TAKEN,
                3);

        User u5 = new User("Ula", "Gwozdz",
                LocalDate.of(1967, 12, 5),
                6500.0,
                User.CIVIC_STATE.TAKEN,
                4);

        User u6 = new User("Janek", "Poranek",
                LocalDate.of(1998, 2, 5),
                8500.0,
                User.CIVIC_STATE.FREE,
                0);

        User u7 = new User("Karol", "Bobko",
                LocalDate.of(1928, 1, 25),
                2500.0,
                User.CIVIC_STATE.TAKEN,
                5);

        User u8 = new User("Marek", "Starek",
                LocalDate.of(1978, 2, 5),
                18500.0,
                User.CIVIC_STATE.TAKEN,
                10);

        User u9 = new User("Marek", "Warek",
                LocalDate.of(2010, 6, 7),
                0.0,
                User.CIVIC_STATE.FREE,
                0);

        User u10 = new User("Zbyszek", "Kieliszek",
                LocalDate.of(1948, 12, 23),
                500.0,
                User.CIVIC_STATE.FREE,
                2);

        ludzie.add(u1);
        ludzie.add(u2);
        ludzie.add(u3);
        ludzie.add(u4);
        ludzie.add(u5);
        ludzie.add(u6);
        ludzie.add(u7);
        ludzie.add(u8);
        ludzie.add(u9);
        ludzie.add(u10);

        //tutaj zaczyna sie zabawa
        //wypisac osoby z dziecmi w stanie wolnym

        ludzie.stream()
                .filter(u -> u.getCivicState().equals(User.CIVIC_STATE.FREE))
                .filter(u -> u.getChildren() > 0)
                .forEach(System.out::println);

        //liczba dzieci osob w wieku > 30 lat
        int sumaDzieci = ludzie.stream()
                .filter(u -> ChronoUnit.YEARS.between(u.getBirthsday(), LocalDate.now()) > 30)
                .mapToInt(User::getChildren)
                .sum();
        System.out.println("Liczba dzieci osob powyzej 30-tego roku zycia: " + sumaDzieci);

//        osoby zarabiające powyżej 5000 PLN
        ludzie.stream()
                .filter(u -> u.getSalary() > 5000)
                .forEach(System.out::println);

//        ilość osób w związku ---> count
        long userTakenCount = ludzie.stream()
                //.filter(u -> u.getCivicState() == User.CIVIC_STATE.TAKEN)
                .filter(u->u.getCivicState().equals(User.CIVIC_STATE.TAKEN))
                .count();
        System.out.println("userTakenCount: " + userTakenCount);

        //        dane osoby mającej największą pensję ---> sort (lepiej Comparator) i 'najwiekszy' wynik
//        Optional<User> userWithMaxSallary = ludzie.stream()
//                .max(new Comparator<User>() ) {
//                    @Override
//                    public int compare(User o1, User o2) {
//                        return Double.compare(o1.getSalary(), o2.getSalary());
//                    }
//                }
//        System.out.println("User with max sallary: " + userWithMaxSallary.get());

//        posortowaną listę osób wg wieku rosnąco ---> Comparable lub Comparator
        ludzie.stream()
                .sorted((u11,u22)-> u11.getBirthsday().compareTo(u22.getBirthsday()))
                .forEach(System.out::println);

    }
}


