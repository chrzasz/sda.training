package sda.training.streamy;

import java.time.LocalDate;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  11:09 AM
 */
public class User {

    private String name;
    private String surname;
    private LocalDate birthsday;
    private double salary;
    private CIVIC_STATE civicState;
    private int children;

    public User(String name, String surname, LocalDate birthsday, double salary, CIVIC_STATE civicState, int children) {
        this.name = name;
        this.surname = surname;
        this.birthsday = birthsday;
        this.salary = salary;
        this.civicState = civicState;
        this.children = children;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthsday=" + birthsday +
                ", salary=" + salary +
                ", civicState=" + civicState +
                ", children=" + children +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public LocalDate getBirthsday() {
        return birthsday;
    }


    public double getSalary() {
        return salary;
    }


    public CIVIC_STATE getCivicState() {
        return civicState;
    }


    public int getChildren() {
        return children;
    }


    enum CIVIC_STATE {
        FREE,
        TAKEN
    }

}