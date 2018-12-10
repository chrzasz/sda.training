package sk.klasyOrazMetody;

public class Superbohater {

    private int punktyZycia;
    private int sila;
    private int zrecznosc;
    private int wytrzymalosc;

    public Superbohater() {}

    public Superbohater(int punktyZycia, int sila, int zrecznosc, int wytrzymalosc) {
        this.punktyZycia = punktyZycia;
        this.sila = sila;
        this.zrecznosc = zrecznosc;
        this.wytrzymalosc = wytrzymalosc;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public void setPunktyZycia(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getZrecznosc() {
        return zrecznosc;
    }

    public void setZrecznosc(int zrecznosc) {
        this.zrecznosc = zrecznosc;
    }

    public int getWytrzymalosc() {
        return wytrzymalosc;
    }

    public void setWytrzymalosc(int wytrzymalosc) {
        this.wytrzymalosc = wytrzymalosc;
    }
}
