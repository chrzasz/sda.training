package sk.klasyOrazMetody;
public class Batman extends Superbohater {

    private boolean batmobil;

    public Batman() {
        super();
    }

    public Batman(int punktyZycia, int sila, int zrecznosc, int wytrzymalosc, boolean batmobil) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.batmobil = batmobil;
    }

    public void uzyjBatmobilu() {
        if (batmobil) {
            System.out.println("Batmobil zostal uzyty.");
        } else {
            System.out.println("Batmobil zostal w garazu.");
        }
    }
}
