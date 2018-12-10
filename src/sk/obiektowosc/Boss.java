package sk.obiektowosc;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  09:44 PM
 */
public class Boss extends Employee {

    private int extraBonus;

    public Boss() {
        super.setName("");
        super.setSurname("");
        super.setAge(0);
        super.setSallary(0);
        this.extraBonus = 0;
    }

    public Boss(String name, int extraBonus) {
        super(name);
        this.extraBonus = extraBonus;
    }

    public Boss(int extraBonus) {
        this.extraBonus = extraBonus;
    }


    @Override
    void showHR() {
        super.showHR();
        System.out.println(this.extraBonus + " extra bonus ");
    }
}
