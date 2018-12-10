package sda.training.enemy;

/**
 * Created by Grzegorz Chrzaszczyk on 30-09-2018  09:21 AM
 */
public class EnemyRunner {
    public static void main(String[] args) {

        Enemy enemy1 = new Enemy(1,1,1);

        System.out.println(enemy1);

        Orc orc1 = new Orc();

        System.out.println(orc1);

        Orc o = new Orc();
        Yeti y = new Yeti();

        Enemy [] enemies = {o,y};

        for (Enemy e: enemies) {
            System.out.println(e.attack());
            System.out.println(e.defend());
        }

    }
}
