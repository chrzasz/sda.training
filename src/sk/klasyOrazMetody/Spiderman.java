package sk.klasyOrazMetody;
public class Spiderman extends Superbohater {

    public Spiderman(int punktyZycia, int sila, int zrecznosc, int wytrzymalosc) {

        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
    }

    public void chodzPoScianach() {
        System.out.println("Chodzi po scianach.");
    }

    public void wystrzelPajeczyne() {

        System.out.println("Pajeczyna wystrzelona.");
    }
}
