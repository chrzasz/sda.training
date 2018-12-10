package sk.klasyOrazMetody.przeslanianieMetod;

public class PrzeslanianieMetod {
    public static void main(String[] args) {

        Figura[] figury = new Figura[] {
                new Figura(10, 10),
                new Prostokat(10, 10),
                new Trojkat(10, 10)
        };

        for (Figura f: figury) {
            f.obliczPolePowierzchni();
            System.out.println(" - - - > > > hashcode: " + f.hashCode());
        }
    }
}