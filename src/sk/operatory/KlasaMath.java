package sk.operatory;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  12:00 AM
 */
public class KlasaMath {

    public static void main(String[] args) {

        double pi = Math.PI;
        double e = Math.E;

        double a = Math.pow(4, 2); //potega 4^2=16

        double b = Math.sqrt(4); //pierwiastek kwadratowy squareroute
        double c = Math.cbrt(27); //pierwiastek szescienny cubicroute

        double d = Math.pow(452, 1./4.);//pierwiasek czwartego stopnia to potega 1/4 (1.=1.0) czyli 1.0/4.0

        double f = Math.log(e);
        double g = Math.log10(100);

        double h = Math.sin(Math.toRadians(90));

        System.out.println(pi);
        System.out.println(e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
