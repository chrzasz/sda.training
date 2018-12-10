package sk.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  11:03 PM
 */
public class ReadConsole {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int tab[] = {1,2,3,4,5};
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Który element tablicy chcesz zobaczyć: ");
        boolean czyPoprawne = false;

        while(!czyPoprawne) {
            try {
                index = Integer.parseInt(odczyt.readLine());
            } catch (NumberFormatException n) { System.out.println("Niepoprawne dane! " +
                    "\n Który element tablicy chcesz zobaczyć: ");
            } catch (IOException e) { System.out.println("Błąd odczytu danych");
            }

            czyPoprawne = index == -1? false : true;
        }

        try {
            System.out.println(tab[index-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj cyfrę od 0 do 9: ");
        String str = br.readLine();
        int liczba = 0;
        if(str.length()==1 && Character.isDigit(str.charAt(0))){
            System.out.println("hurra podałeś cyfrę");
            liczba = Integer.parseInt(str);
        }
        else{
            System.out.println("niestety podałeś nieprawidłowe dane");
        }

        // %f oznacza, że w to miejsce zostanie wstawiona liczba rzeczywista
        // %d oznacza, że w to miejsce zostanie wstawiona liczba całkowita
        System.out.format("Podana liczba całkowita wynosi %d, natomiast "
                + "rzeczywista %f. Wynik dzielenia: %f\n", 12, 12f, 12/12f);

        System.out.format("\nPI: %.4f, %.3f, %.2f, %.1f, %.0f\n",
                Math.PI, Math.PI, Math.PI, Math.PI, Math.PI);



    }
}
