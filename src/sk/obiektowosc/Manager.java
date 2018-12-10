package sk.obiektowosc;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  10:33 PM
 */
public class Manager extends Employee {
    private int personsUnder;

    public Manager() {
        this.personsUnder = 0;
    }

    public Manager(String name, String surname, int age, int sallary) {
        super(name, surname, age, sallary);
        this.personsUnder = 0;
    }

    public Manager(String name, String surname, int age, int sallary, int personsUnder) {
        super(name, surname, age, sallary);
        this.personsUnder = personsUnder;
    }

    public Manager(Employee employee, int personsUnder) {
        super(employee);
        this.personsUnder = personsUnder;
    }

    public Manager(int personsUnder) {
        this.personsUnder = personsUnder;
    }

    @Override
    void showHR() {
        super.showHR();
        System.out.println(this.personsUnder + " persons under ");
    }
}


