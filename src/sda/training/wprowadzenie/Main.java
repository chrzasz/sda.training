package sda.training.wprowadzenie;

/**
 * Created by Grzegorz Chrzaszczyk on 29-09-2018  11:00 AM
 */
public class Main {
    public static void main(String[] args) {

        Point A = new Point();
        Point B = new Point(100,1);

        System.out.println("Point A = " + A);
        System.out.println("Point B = " + B);

        Line line1 = new Line(A, B);
        System.out.println("Distance: [ " +A + " ; " + B + " ] = "  + line1.getLength());

        Line l2 = new Line(10,10,10,10);

        double odleglosc;
        odleglosc = line1.getLength();
        System.out.println("Odleglosc: " + odleglosc);

        l2.setBegin(new Point(1,1));

        System.out.println(l2);

        System.out.println("Dl. odcinka L1 = " + line1.getLength());
        System.out.println("Dl. odcinka L2 = " + l2.getLength());


    }
}
