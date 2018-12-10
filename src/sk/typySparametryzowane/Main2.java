package sk.typySparametryzowane;

/**
 * Created by Grzegorz Chrzaszczyk on 10-12-2018  10:47 PM
 */

//parametryzacja klas

public class Main2 {

    public static void main(String[] args) {


        //bez podawaniu typy bedzie automatycznie Object
        KlasaGeneryczna<Double,String> klasaGeneryczna = new KlasaGeneryczna<>(10.0,"Raz");
        klasaGeneryczna.nazwaTypuGenerycznego();

        double var = klasaGeneryczna.getPoleGeneryczne();


    }

}
