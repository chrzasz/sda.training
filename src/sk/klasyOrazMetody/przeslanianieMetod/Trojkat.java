package sk.klasyOrazMetody.przeslanianieMetod;

public class Trojkat extends Figura {

    private double a;
    private double h;

    public Trojkat(double a, double h) {
        super(a, h);
        this.a = a;
        this.h = h;
    }

    // Przesloniecie metody.
    public void obliczPolePowierzchni() {
        System.out.print((a * h) / 2);
    }
}
