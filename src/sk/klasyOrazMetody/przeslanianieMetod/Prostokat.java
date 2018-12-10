package sk.klasyOrazMetody.przeslanianieMetod;

public class Prostokat extends Figura {

    private double a;
    private double b;

    public Prostokat(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    // Przesloniecie metody.
    public void obliczPolePowierzchni() {
    	System.out.print(a * b);
    }
}
