package sk.porownywanieObiektow;

/**
 * Created by Grzegorz Chrzaszczyk on 13-10-2018  11:06 AM
 */

    /*
    Napisz klasę reprezentującą człowieka, zaimplementuj metody hashCode i equals.
    Zastanów się czy to, że ktoś ma to samo imię i nazwisko sprawia, że jest to ta sama osoba?
    Jaki atrybut może posłużyć do sprawdzenia czy dwie instancje klasy Human reprezentują tę samą osobę?
     */


public class Human {

    String name;
    String surname;
    String pesel;

    public Human(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        if (pesel == null) {
            throw new IllegalArgumentException("Every human needs to have PESEL!");
        }
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + pesel;
    }


    @Override
    public int hashCode() {
        return 17 * pesel.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Human)) {
            return false;
        }

        Human otherHuman = (Human) obj;
        return pesel.equals(otherHuman.getPesel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }


}


