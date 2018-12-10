package sda.training.enemy;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  09:19 AM
 */
public class Orc extends Enemy{

/*    public void attack() {
        System.out.println("Orc atakuje " );
    }

    public void defend() {
        System.out.println("Orc pochlaniam ");
    }*/

    public Orc (){
        this.attackPints=75;
        this.defendPoints=75;
        this.healthPoints=200;

    }

    @Override
    public String attack() {
        return "Orc " + super.attack();
    }

    @Override
    public String defend() {
        return "Orc " + super.defend();
    }
}
