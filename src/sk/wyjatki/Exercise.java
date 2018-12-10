package sk.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 12-10-2018  09:33 PM
 */
public class Exercise {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            try {
                userInput = input.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                // ignoring wrong token
                input.next();
            }
        }

        if (userInput < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje!", userInput));
        }

        System.out.print(String.format("Pierwieastek z %.4f to %.4f.", userInput, Math.sqrt(userInput)));
    }
}
