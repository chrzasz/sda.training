package sk.obiektowosc;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  08:37 PM
 */
public class Runner {

    public static void main(String[] args) {

        // typy proste przekazane jako argument nie są bezpośrednio modyfikowane !!!
        int a = 5;
        Test.zwieksz(a);
        System.out.println(a);


        Point point1 = new Point();
        point1.x = 5;
        point1.y = 5;
        Point point2 = new Point(100,100);
        Point point3 = new Point(11,22, "punkt 3");
        Point point4 = new Point(point3);

        Test.zmien(point1);
        point1.show();        System.out.println();
        point1.increaseXY();
        point1.increaseXY();
        point1.show();        System.out.println();
        point2.show();        System.out.println();
        point3.show();        System.out.println();
        point4.show();        System.out.println();

        //jesli metody nie sa statyczne to trzeba powolac instancje klasy
        Suma suma = new Suma();
        System.out.println(suma.dodaj(123,123));
        //metoda przeciazona
        System.out.println(suma.dodaj(123.0d,123.0d));


        Point3D point3D_1 = new Point3D();
        point3D_1.show();
        Point3D point3D_2 = new Point3D(3,3,3);
        point3D_2.show();
        Point3D point3D_3 = new Point3D(3,3,3);
        point3D_3.increaseXY();
        point3D_3.show();

    }


}
