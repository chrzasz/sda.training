package sda.homework;

// Importowanie biblioteki potrzebnej do wczytywania danych

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk
 */
public class Thermometer {


    private static final short TEMP_MIN = -40;
    private static final short TEMP_MAX = 60;
    private static final short TEMP_STEP = 10;
    private static final short TEMP_ARR_SIZE = (-TEMP_MIN + TEMP_MAX) / TEMP_STEP;
    private static final short WIND_SPEED_MIN = 5;
    private static final short WIND_SPEED_MAX = 55;
    private static final short WIND_SPEED_STEP = 5;
    private static final short WIND_SPEED_ARR_SIZE = (WIND_SPEED_MIN + WIND_SPEED_MAX) / WIND_SPEED_STEP;

    private double[] temperature = new double[TEMP_ARR_SIZE];
    private double[] windSpeed = new double[WIND_SPEED_ARR_SIZE];
    private double[][] tab = new double[WIND_SPEED_ARR_SIZE][TEMP_ARR_SIZE];

    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();
        thermometer.loop();

    }

    public void loop() {

        short temp = TEMP_MIN;
        short speed = WIND_SPEED_MIN;

        System.out.println("TEMP_ARR_SIZE = " + TEMP_ARR_SIZE);
        System.out.println("WIND_ARR_SIZE = " + WIND_SPEED_ARR_SIZE);

        // fill and show table temperature
        System.out.print("tab temperature: ");
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = temp;
            temp += TEMP_STEP;
            System.out.print(temperature[i] + " | ");
        }
        System.out.println("");

        // fill and show table windSpeed
        System.out.print("tab windSpeed: ");
        for (int i = 0; i < windSpeed.length; i++) {
            windSpeed[i] = speed;
            speed += WIND_SPEED_STEP;
            System.out.print(windSpeed[i] + " | ");
        }
        System.out.println("");

        // calculate temperature
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = calc(i, j);
            }
        }


        // show calculated temperature in formatted table view
        showTableFormatted();

        // Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Type temperature: ");
        int t = in.nextInt();
        System.out.print("Type wind speed: ");
        int w = in.nextInt();
        System.out.println("tab value = " + tab[t][w]);

        System.out.println("< END LOOP >");

    }

    // calculate temperature method: w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v^(0.16)
    public double calc(int i, int j) {
        double w = 0; //
        w = 35.74 + 0.6215 * temperature[j] + (0.4275 * temperature[j] - 35.75)
                * Math.pow(windSpeed[i], (0.16));

        return w;
    }

    public void showTableFormatted() {
//        for (int i = 0; i < tab.length; i++)
//            for (int j = 0; j < tab[i].length; j++) {
//                System.out.printf("tab[%d][%d] = %.1f", i, j, tab[i][j]);
//                System.out.printf("\t--->\ttemp[%.1f]\t", temperature[j]);
//                System.out.printf("\tspeed[%.1f]\n", windSpeed[i]);
//            }
        System.out.println("Arrays to string: " + Arrays.toString(tab));
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }
}


/*
Zad. 1	//tablice, pętle
Odczuwalną temperaturę możemy wyliczyć ze wzoru:

w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v^(0.16)

Gdzie t jest temperaturą wyrażoną w Fahrenheitach, a
v - prędkością wiatru (w milach na godzinę, mph).

Utwórz tablicę dwuwymiarową, której jeden wymiar odpowiada temperaturze w Fahrenhaitach,
od -40 F (co odpowiada -40 stopni Celsiusza) do 50 F (10 st C) co 10 F,
a drugi wymiar - prędkości wiatru w mph,
od wartości od 5 mph (ok. 8 hm/h) do 75 mph (ok. 120 km/h), co 5 mph.
Dla poszczególnych par wartości wyznacz odczuwalną temperaturę
i zapisz w odpowiednim miejscu tabeli (na ich "przecięciu").
Następnie pobierz od użytkownika wartość temperatury i prędkości w dozwolonych
zakresach, odszukaj w utworzonej tablicy odpowiadającą im wartość
odczuwalnej temperatury i ją wyświetl.
 */