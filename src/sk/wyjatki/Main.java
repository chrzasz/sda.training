package sk.wyjatki;

import java.io.IOException;

/**
 * Created by Grzegorz Chrzaszczyk on 09-10-2018  01:51 AM
 * Pierwsza i najważniejsza zasada, blok try powinien być jak najmniejszy.
 * Takie podejście bardzo ułatwia znajdowanie błędów w bardziej skomplikowanych programach.
 * Dzięki małemu blokowi try także możemy napisać lepszy kod do obsługi wyjątku –
 * wiemy dokładnie z którego miejsca wyjątek może zostać rzucony więc wiemy także jak
 * najlepiej na niego zareagować.
 * Blok finally bardzo często jest niezbędny. Szczególnie jeśli operujemy na instancjach,
 * które wymagają “zamknięcia”.
 * Używaj klas wyjątków, które idealnie pasują do danej sytuacji. Jeśli nie ma takiego wyjątku w bibliotece standardowej utwórz własną klasę wyjątku.
 * Tworząc instancję wyjątków podawaj możliwie najdokładniejszy opis w treści wyjątku.
 * Pozwala to na dużo łatwiejsze znajdowanie błędów w programie jeśli komunikat
 * wyjątku jest szczegółowy.
 * Nie zapominaj o używaniu wyjątków typu checked.
 * Chociaż wymagają trochę więcej kodu i generują często irytujące błędy kompilacji
 * ich używanie jest czasami wskazane.
 */
public class Main {

    public static void main(String[] args) {

        Time tim = new Time();
        Main instance = new Main();

        try {
            instance.methodWithCheckedException();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        tim.getNumberOfSeconds(-100);


        int hours = -1;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = tim.getNumberOfSeconds(hours);
        }
        catch (IllegalArgumentException exception) {
            numberOfSeconds = tim.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);


    }

    private void methodWithCheckedException() throws IOException {
        throw new IOException();
    }
}

