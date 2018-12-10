package sda.training.regexy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grzegorz Chrzaszczyk on 07-10-2018  12:18 PM
 */
public class Runner {

    public static void main(String[] args) {
        String inputText = "Secret John 007, kom.: 777-999-000, lives at SchwabStrasse 7 @Stutgart";
        String inputText1 = "Jan Kowalski, ur. 20.02.1987 r., zam. ul. Jutrzenki 105, 02-716 Warszawa, odwiedził stany: CA i AL, e-mail: janekk87@gmail.com, kom.: (+48) 789-215-618, hobby: kung fu, wieprzowina, Xiaomi";


//        String regex = "@";
//        String regex = "[0-9]";
        //slowa poprzedzone @ o dlugosci od 2 do 20
//        String regex = "@[A-Za-z]{2,20}";
        String regex = "\\s[0-9]{2,20},";

//        kod pocztowy, symbole stanów na C i A
//                (przeszukiwany zbiór: AK, AL, AR, AZ, CA, CO, CT), adres e-mail, wypisz jego hobby.

        String regexKodPocztowy = "\\s[0-9]{2}-[0-9]{3}";
        String postalCode = "\\d{2}-\\d{3}";
        printRegexResults(postalCode, inputText1);

        String regexState = "AK|AL|AR|AZ|CA|CO|CT";
        String stateRegex = "A[KLRZ]|C[AOT]";
        printRegexResults(stateRegex, inputText1);

        String regexEmail = "[A-Za-z0-9._-]+@+[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}";
        printRegexResults(regexEmail, inputText1);

        String regexHobby = "hobby: .*";
        printRegexResults(regexHobby, inputText1);




    }

    //statyczna metoda utility
    public static void printRegexResults(String regexStr, String textStr) {
        Pattern regex = Pattern.compile(regexStr);
        Matcher matcher = regex.matcher(textStr);
        while (matcher.find()) {
            if (matcher.group().length() != 0) {
                System.out.println(matcher.group().trim());
            }

            System.out.println("Start index: " + matcher.start());
            System.out.println("End index: " + matcher.end());
        }

    }
}


