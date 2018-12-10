package sda.training.algorytmy;

import java.text.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * Created by Grzegorz Chrzaszczyk on 14-10-2018  10:09 AM
 */
public class Program {
    public static void main(String[] args) throws Exception {

    } // END Main






}


/**





 * 11. Napisz program który wyświetli N elementów ciągu fibonacciego
 * 11.1. Do każdego wypisywanego elemetnu wypisz jego stosunek do poprzedniego elementu
 * 11.2. Ile elementów ciągu jesteś w stanie obliczyć używając zminnych typu int? long? BigInteger?

 * 13. Do programu wypisującego ciąg liczb fibonnaciego dodaj wypisywanie liczb ciągu w postaci binarnej
 * 14. Napisz program który zapisze w pilku .png kwardat wypełniony na niebiesko, koło wypełnione na czerwono.
 * Podpowiedź - kawałek kodu który towrzy plik png
 * // Constructs a BufferedImage of one of the predefined image types.
 * BufferedImage bufferedImage = new BufferedImage(100, n, BufferedImage.TYPE_INT_RGB);
 * // Create a graphics which can be used to draw into the buffered image
 * Graphics2D g2d = bufferedImage.createGraphics();
 * // fill all the image with white
 * g2d.setColor(Color.white);
 * g2d.fillRect(0, 0, 100, n);
 * // this is how we set a color
 * g2d.setColor(Color.yellow);
 * // this is how we fill a rectangle
 * g2d.fillRect(12, 24, 50, 50);
 * // this is how we set one pixel
 * g2d.fillRect(5, 10, 1, 1);
 * // Disposes of this graphics context and releases any system resources that it is using.
 * g2d.dispose();
 * // Save as PNG
 * File file = new File("myimage.png");
 * ImageIO.write(bufferedImage, "png", file);
 *
 * 15. Wróćmy do programu fibbonaci. Wykorzystajmy zapisywanie liczb w postaci binarnej i zapisywanie plików .png.
 * Stwórz obrazek w którym każdy wiersz będzie reprezentował jeden element ciągu w postaci binarnej.
 * Zamiast 0 zapisz biały piksel, zamiast 1 zapisz czarny piksel.
 * Czyli obrazek powinien zaczyć się tak:
 * 1            ■
 * 10           ■
 * 11           ■■
 * 101          ■ ■
 * 1000         ■
 * 1101  ->     ■■ ■
 * 10101        ■ ■ ■
 * 100010       ■   ■
 * 110111       ■■ ■■■
 * 1011001      ■ ■■  ■
 * 10010000     ■  ■
 * <p>
 * 16. Napisz kalkulator stringów. Kalkulator operuje tylko na małych literach. Operacje które musi obsługiwać kalkulator:
 * 16.1. add
 * przykłady:
 * "ala" + "mak" = "alamak"
 * 16.2. sub
 * przykłady:
 * "ala" - "a" = "al"
 * "ala" - "bba" = "al"
 * "ala" - "xxx" = "ala"
 * "ala" - "alaala" = ""
 * 16.3. sub_m
 * przykłady:
 * "ala" -m "a" = ""
 * "ala" -m "bba" = "bb"
 * "ala" -m "xxx" = "xxx"
 * 16.4. uniq
 * przykłady:
 * "ala" u = "al"
 * "xxx" u = "x"
 * "majtek" u = "majtek"
 * 16.5. inter
 * przykłady:
 * "ala" u "aaa" = "aa"
 * "kota" u "ole" = "o"
 * "abcdefg" u "cdefghij" = "cdefg"
 * 16.6. dim_d
 * przykłady:
 * "ala" o "aaa" = "l"
 * "ala" o "xxx" = "alaxxx"
 * "abcdefg" o "defghijkl" = "abcijkl"
 *

 */