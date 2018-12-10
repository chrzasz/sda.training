package sk.obiektowosc;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  08:18 PM
 */
public class Employee {
    private String name, surname;
    private int age;
    private int sallary;

    public Employee() {
        this.name = "";
        this.surname = "";
        this.age = -3;
        this.sallary = 0;
    }

    public Employee(String name) {
        this.name = name;
        this.surname = "";
        this.age = -2;
        this.sallary = 0;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
        this.sallary = 0;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sallary = 0;
    }

    public Employee(String name, String surname, int age, int sallary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sallary = sallary;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.surname = employee.surname;
        this.age = employee.age;
        this.sallary = employee.sallary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    void show() {
        System.out.print(getName() + " " + getSurname() + ", " + getAge() + " years old ");
    }

    void showHR() {
        System.out.print(getName() + " " + getSurname() + ", " + getAge() + " years old " + getSallary() + " sallary ");
    }
}
