package sda.training.scanners;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 16-09-2018  11:48 AM
 */
public class SampleScanner {
    public static void main(String[] args) {
        String firstName ="";
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        firstName=scanner.nextLine();
        System.out.println("Hello "+firstName);




        System.out.println("Program sumuje 5 liczb całkowitych");
        System.out.println("podaj kolejne liczby, jeśli chcesz przerwać wpisz K");
        String liczbaStr;
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(" Podaj "+ i + " liczbę: ");
            liczbaStr = scanner.next();
            if (liczbaStr.equalsIgnoreCase("K"))
                // Jesli uzytkownik wybrał "K" wyjście z pętli
                break;
            else {
                // Konwersja łańcucha znaków na int
                suma += Integer.parseInt(liczbaStr);
            }
        }
        System.out.println("Suma = "+ suma);

    }
}
