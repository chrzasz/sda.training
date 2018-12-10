package sk.klasyOrazMetody;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  08:35 PM
 */
public class FabrykaProstokatow {

    public static void main(String[] args){
        Prostokat prostokatNumerJeden = new Prostokat(10, 5);
        Prostokat prostokatNumerDwa = new Prostokat(4, 2);

        prostokatNumerJeden.setA(20);
        prostokatNumerJeden.setB(33);

        System.out.println("a1 = " + prostokatNumerJeden.getA() );
        System.out.println("b1 = " + prostokatNumerJeden.getB() );

        System.out.println("a2 = " + prostokatNumerDwa.getA() );
        System.out.println("b2 = " + prostokatNumerDwa.getB() );


        System.out.println("hascode 1: " + prostokatNumerJeden.hashCode() );
        System.out.println("hascode 2: " + prostokatNumerDwa.hashCode() );

        Prostokat prostokatNowy = new Prostokat(5,3,"P01");
        System.out.println(prostokatNowy.getNazwaProstokta());

        prostokatNowy.test();
        prostokatNowy.test("Korzystam z drugiej metody przeciazonej test");
        int poleProstokata = prostokatNowy.test(prostokatNumerJeden.getA(),prostokatNumerJeden.getB());
        System.out.println(poleProstokata);
    }

}
