package sk.klasyOrazMetody;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  09:43 PM
 */
public class SuperbohaterowieWAkcji {
    public static void main(String[] args) {

        Superbohater superbohater = new Superbohater();
        superbohater.setPunktyZycia(100);
        superbohater.setSila(10);
        superbohater.setZrecznosc(20);
        superbohater.setWytrzymalosc(30);

        Batman batman = new Batman(300, 20, 10, 20, true);
        batman.uzyjBatmobilu();
        batman.setSila(20);

        Spiderman spiderman = new Spiderman(200, 10, 20, 15);
        spiderman.chodzPoScianach();
        spiderman.setWytrzymalosc(30);
    }
}

