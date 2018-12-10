package sda.training.enemy;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  09:45 AM
 */
public class Yeti extends Enemy{

    public Yeti (){
        this.attackPints=10;
        this.defendPoints=10;
        this.healthPoints=100;

    }

    @Override
    public String attack() {
        return "Yeti " + super.attack();
    }

    @Override
    public String defend() {
        return "Yeti " + super.defend();
    }
}
