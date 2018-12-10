package sda.training.wprowadzenie;

/**
 * Created by Grzegorz Chrzaszczyk on 29-09-2018  01:42 PM
 */
public class Person {

    private String name;
    private String address;

    public Person() {         //domyslna wartosc dla konstruktora jest niezbedna

        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {

        return this.name;
    }

    public String getAddress() {

        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }



/*    @Override
    public String toString() {
        return "Person = " + name + " ; " + address;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}





