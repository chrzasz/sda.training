package sda.training.enemy;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  09:15 AM
 */
public class Enemy {

    protected double healthPoints; //protected to w klasie pochodnej jest to widoczne
    protected double attackPints;
    protected double defendPoints;

    public Enemy() {
        this.healthPoints = 0.0;
        this.attackPints = 0.0;
        this.defendPoints = 0.0;
    }

    public Enemy(double healthPoints, double attackPints, double defendPoints) {

        this.healthPoints = healthPoints;
        this.attackPints = attackPints;
        this.defendPoints = defendPoints;
    }


    public String attack() {
        return "atakuje " + attackPints;
    }

    public String defend() {
        return "pochlaniam " + defendPoints;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "healthPoints=" + healthPoints +
                ", attackPints=" + attackPints +
                ", defendPoints=" + defendPoints +
                '}';
    }
}
