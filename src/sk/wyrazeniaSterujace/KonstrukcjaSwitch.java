package sk.wyrazeniaSterujace;

/**
 * Created by Grzegorz Chrzaszczyk on 29-08-2018  12:31 AM
 */
public class KonstrukcjaSwitch {
    public static void main(String[] args) {

        int a = 0;

        switch (a) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Jeden");
                break;
            default:
                System.out.println("Wartość inna od 0 i 1");
        }

        switch (a) {
            case 0:
            case 1:
                // Zbiór instrukcji 1.
                break;
            case 2:
            case 3:
                // Zbiór instrukcji 2.
                break;
            default:
                // Zbiór instrukckji.
        }

        String b = "Jan Kowalski";

        switch (a) {
            case 0:
                switch (b) {
                    case "Jan Kowalski":
                        // Jakieś instrukcje.
                        break;
                    default:
                        // Jakieś instrukcje.
                }
                break;
            default:
                // Jakieś instrukcje.
        }
    }
}

