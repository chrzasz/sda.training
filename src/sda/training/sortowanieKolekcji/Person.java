package sda.training.sortowanieKolekcji;

/**
 * Created by Grzegorz Chrzaszczyk on 27-10-2018  02:46 PM
 * Dostaniecie plik CSV plik z 1000 użytkowników
 * Wczytaj dane z pliku
 * Użyj Collections.sort() aby posortować dane według:
 * Imienia
 * Wieku
 * Peselu
 * Wieku – potem nazwiska
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
