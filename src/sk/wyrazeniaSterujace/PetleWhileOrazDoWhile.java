package sk.wyrazeniaSterujace;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  12:33 AM
 */
public class PetleWhileOrazDoWhile {
    public static void main(String[] args) {

        int iterator = 1;

        while (iterator == 2) {
            System.out.println("Jestem w petli While");
        }

        do {
            System.out.println("Jestem w petli Do-While");
        } while (iterator == 2);

    }
}
