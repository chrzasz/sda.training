package sk.wyrazeniaSterujace;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  07:59 PM
 */
public class OperatorInstanceof {
    public static void main(String[] args) {
        Float x = 10.0f;
        Integer y = 10;
        Double z =10.0;
        metoda(z);
    }

    private static void metoda(Number number) {
        if (number instanceof Integer) {
            System.out.println("Zmienna number jest typu Integer.");
        } else if (number instanceof Double) {
            System.out.println("Zmienna number jest typu Double.");
        } else {
            System.out.println("Blad.");
        }
    }
}

