package sk.wyrazeniaSterujace;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  12:51 AM
 */
public class EtykietyOrazInstrukcjeBreakContinue {
    public static void main(String[] args) {

//        etykieta: for (int i = 0; i < 10; i++) {
//            for (;;) {
//                for (;;) {
//                    break etykieta;
//                }
//            }
//        }
//
//        jeden: {
//            dwa: {
//                trzy: {
//                    System.out.println("Poczatek trzeciego bloku.");
//                    if (true) break dwa;
//                    System.out.println("Koniec trzeciego bloku.");
//                }
//                System.out.println("Za trzecim blokiem.");
//            }
//            System.out.println("Za drugim blokiem.");
//        }

        etykieta: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) continue etykieta;
                System.out.println("i = " + i + ", j = " + j);
            }
        }


    }
}